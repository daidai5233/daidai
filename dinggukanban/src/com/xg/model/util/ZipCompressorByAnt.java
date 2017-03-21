package com.xg.model.util;

import java.io.File;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Zip;
import org.apache.tools.ant.types.FileSet;

public class ZipCompressorByAnt {
	    
    /** 
     * 执行压缩操作 
     * @param srcPathName 需要被压缩的文件/文件夹 
     * @param finalFile   最终压缩生成的压缩文件：目录+压缩文件名.zip 
     */  
    public static Boolean compressZip(String srcPathName,String finalFile) { 
    	File zipFile = new File(finalFile);  
        File srcdir = new File(srcPathName);    
        if (!srcdir.exists()){  
            return false;    
        }   
        Project prj = new Project();    
        Zip zip = new Zip();    
        zip.setProject(prj);    
        zip.setDestFile(zipFile);    
        FileSet fileSet = new FileSet();    
        fileSet.setProject(prj);    
        fileSet.setDir(srcdir);    
        //fileSet.setIncludes("**/*.java"); //包括哪些文件或文件夹 eg:zip.setIncludes("*.java");    
        //fileSet.setExcludes(...); //排除哪些文件或文件夹    
        zip.addFileset(fileSet);    
        zip.execute(); 
        return true;
    }   
}
