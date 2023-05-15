package com.bitcoin.oldschool.service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;

public class QRCodeGenerator {

    private static final String CHARSET = "UTF-8";

    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;

    public static void generateQRCode(String data, String path) throws WriterException, IOException {
        BitMatrix matrix = new QRCodeWriter().encode(new String(data.getBytes(CHARSET), CHARSET), BarcodeFormat.QR_CODE, WIDTH, HEIGHT);
        MatrixToImageWriter.writeToPath(matrix, path.substring(path.lastIndexOf('.') + 1), FileSystems.getDefault().getPath(path));
    }

}
