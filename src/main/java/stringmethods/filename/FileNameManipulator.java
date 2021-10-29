package stringmethods.filename;

public class FileNameManipulator {
    public FileNameManipulator() {
    }

    public String findFileExtension(String fileName) {
        String backString;
        int pointPos = fileName.indexOf(".");
        int length = fileName.length();
        backString = fileName.substring(pointPos+1,length);
        return backString;
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        boolean back = false;
        int pointPos = fileName.indexOf(".");
        int length = fileName.length();
        String fileExt = fileName.substring(pointPos+1,length);
        back = ext.equals(fileExt);
        return  back;
    }

    public boolean identifyFilesByName(String serchedFileName, String actualFileName) {
        boolean back = false;
        back = serchedFileName.equals(actualFileName);
        return back;
    }

    public String changeExtensionToLowerCase(String fileName) {
        String backString ="";
        int pointPos = fileName.indexOf(".");
        int length = fileName.length();
        String ext = fileName.substring(pointPos+1, length);
        String extLower = ext.toLowerCase();
        backString = fileName.replace(ext,extLower);
        return backString;
    }

    public String replaceStringPart(String fileName, String present, String target) {
        String backString = "";
        return backString;
    }

    public static void main(String[] args) {
        FileNameManipulator fileNameMan = new FileNameManipulator();

        System.out.println(fileNameMan.findFileExtension("kukac.com"));

        System.out.println("Megegyezik a megadott kiterjesztés és a file kit: "+fileNameMan.identifyFilesByExtension("com", "kukac.com"));
        System.out.println("Megegyezik a megadott kiterjesztés és a file kit: "+fileNameMan.identifyFilesByExtension("jpg", "kukac.com"));

        System.out.println("Megegyezik a két megadott filenév (kukac, kukac): "+fileNameMan.identifyFilesByName("kukac", "kukac"));
        System.out.println("Megegyezik a két megadott filenév (kukac, holapat): "+fileNameMan.identifyFilesByName("kukac", "holapat"));

        System.out.println("Kiterjesztés módosítása kisbetűsre: "+fileNameMan.changeExtensionToLowerCase("kukac.CoM"));
        System.out.println("Kiterjesztés módosítása kisbetűsre: "+fileNameMan.changeExtensionToLowerCase("kukac.JPG"));
    }
}
