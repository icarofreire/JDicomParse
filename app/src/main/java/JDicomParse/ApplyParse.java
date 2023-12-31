/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JDicomParse;

import java.io.File;
import java.util.LinkedHashMap;

/*\/ parse dicom; */
import AC_DicomIO.AC_DcmStructure;
import AC_DicomIO.AC_DicomReader;

public class ApplyParse {
    
    private final LinkedHashMap<Integer, String[]> parseDicom(File dicom) {
        LinkedHashMap<Integer, String[]> attr = null;
        final AC_DicomReader dicomReader = new AC_DicomReader();
        dicomReader.readDCMFile(dicom.getAbsolutePath());
        try {
            final AC_DcmStructure dcmStructure = dicomReader.getAttirbutes();
            if(dcmStructure != null){
                attr = dcmStructure.getAttributes();
            }else{
                /*\/ not dicom(.dcm/.ima) file; */
                // System.out.println(">> [NULL];");
            }
        } catch (java.io.IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return attr;
    }

}
