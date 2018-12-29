package com.example.dutest.dutest;

import com.squareup.leakcanary.AnalysisResult;
import com.squareup.leakcanary.DisplayLeakService;
import com.squareup.leakcanary.HeapDump;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class LeakUploadService extends DisplayLeakService {
    @Override
    protected void afterDefaultHandling(HeapDump heapDump, AnalysisResult result, String leakInfo) {
        if (!result.leakFound || result.excludedLeak) {
            return;
        }
        //写入操作
        String newLeakInfo = leakInfo + "****************";
        String fileName = "/sdcard/Download/leak.txt";
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(file));
                bos.write(newLeakInfo.getBytes());
                bos.close();
            } else {
                FileWriter fw = new FileWriter(fileName, true);
                fw.write(newLeakInfo);
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}