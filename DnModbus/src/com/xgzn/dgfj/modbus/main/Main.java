package com.xgzn.dgfj.modbus.main;

import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;


/**********
 * 测试主窗体
 * @author dd
 * @date 2017年3月2日
 **********/

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Timer timer;
	private static JLabel label_1;
	public static JLabel label_2;
	private static final int WIDTH = 450;
	private static final int HEIGHT =150;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setType(Type.POPUP);
		setForeground(new Color(240, 230, 140));
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setBackground(new Color(85, 107, 47));
		setBounds(new Rectangle(2, 2, 2, 2));
		setFont(new Font("华文仿宋", Font.PLAIN, 14));
		setAlwaysOnTop(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\workspaces\\fuxi\\TestWindow\\main.ico"));
		setTitle("顶固分拣采集程序    v1.0.0\t  170302");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, WIDTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		label_1 = new JLabel("顶固集创家居分拣采集程序");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setFont(new Font("华文仿宋", Font.BOLD, 24));
		label_1.setBounds(70, 10, 300, 32);
		contentPane.add(label_1);
		label_2 = new JLabel("滚动提示框");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("宋体", Font.ITALIC, 18));
		label_2.setBounds(0, 80, 400, 24);
		contentPane.add(label_2);
//		timer = new Timer(50, new Gundong(label_2));
//		timer.start();
		//启动主处理线程
		new MainThread().start();
	}
	
	//Swing 动画，不断的更新图像的位置，已达到动画的效果。  
    private class Gundong implements ActionListener {
    	private JComponent c;
    	private int x;
    	private int y;
    	private int h;
    	private int w;
		public Gundong() {}
		public Gundong(JComponent c) {
			this.c = c;
			x = this.c.location().x;
			y = this.c.location().y;
			h = this.c.size().height;
			w = this.c.size().width;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			x+=3;
			if(x>=WIDTH){
				x=0;
			}
			c.setBounds(x, y,w,h);
			repaint();
		}  
    }  
}
