package chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//TODO:java.io and java.nio
public class Example {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\DELL\\Documents\\Downloads\\");


        try( DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            directoryStream.forEach(System.out::println);
            directoryStream.forEach(p->{
                if(Files.isDirectory(p)) System.out.println(p);
            });
        }catch (IOException e){
        System.err.println(e.getMessage());
        e.printStackTrace();
    }


            //step1

            //step 2
            //System.out.println(Files.exists(path));
//            Files.deleteIfExists(path);
//        }catch (IOException exception){
//            exception.printStackTrace();
//        }



    }
}
