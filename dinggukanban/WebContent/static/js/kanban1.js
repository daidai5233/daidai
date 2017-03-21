//生成立库(lkh: A1)
var lkhTemp;
function create(lkh){
	lkhTemp = lkh;
	var str = "";
	var temp = "";
	var a1=lkh,a2=0,a3=0;
	for(var i=1;i<=8;i++){
		str += "<div class='row lkrow'>";
		str += "<div class='col-md-1'>";
		str += "    <h6 class='text-right'>"+lkh+i+"</h6>";
		str += "</div>";
		str += "<div class='col-md-11'>";
		str += "	<table class='lk' id='lk' border='1'>";
		str += "		<tr>";
		for(var j=1;j<=40;j++){
			a2 = i;
			a3 = format(j);
			temp = lkh+a2+a3;
			str += "<td id='"+temp+"'>"+temp+"</td>";
			if(j%20==0){
				if(i>=7)break;
				str += "</tr><tr class='dkw'>";
			}
		}
		str+="</tr>";
		str+="</table>";
		str+="</div>";
		str+="</div>";
		str+="<br>";
	}
	
	return str;
}

//查库位信息
function findkwzt(lkh){
	if(lkh==null || lkh.trim()=="")return;
	$.ajax({
		async:false,
		type:"POST",
		url:basePath+"kanban/findzt.do",
		data:{"type":"findkw","lkh":lkh},
		dataType:"json",
		timeout:20000,
		success:function(data){
			var kws = data;
			for(var i=0;i<kws.length;i++){
				var zt = kws[i].zhuangtai;
				var kwbh = kws[i].bianhao;
				var kw = $("#"+kwbh);
				if(zt=="空闲"){
					kw.addClass("green");
				}else if(zt=="锁定"){
					kw.addClass("yellow");
				}else if(zt=="占用"){
					kw.addClass("red");
				}else{
					
				}
			}
		},
		error:function(){
			console.log("错误");
		},
		complete:function(){
			setTimeout("findkwzt('"+lkhTemp+"')", 5000);
		}
	});
}

//格式化10以内的数字(2转为02)
function format(num){
	if(num>0 && num<10){
		return "0"+num;
	}else{
		return num;
	}
}