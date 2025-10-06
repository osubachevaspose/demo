package com.aspose.pdf.examples;

import com.aspose.pdf.examples.AsposePdfExamples.DocumentConversion.*;
import com.aspose.pdf.examples.AsposePdfExamples.TaggedPDFs.*;

import java.io.File;

public class Utils {

    public static void main(String[] args) {
        PDFToHTMLWithFontSubstitution.runExamples();
        AddStructureElementIntoElement.runExamples();
    }

    private static File dir = null;

    public static String getSharedDataDir() {
        if (dir == null) {
            dir = new File("src/main/resources/");
        }
        return dir.toString() + File.separator;
    }

    public static String getDataDir(String testID) {
        return getSharedDataDir() + testID;
    }

    public static String getOutDir(String testID) {
        return "testout/" + testID;
    }
}
