package reqresAPI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        PostCreatePutUpdate postCreatePutUpdate = new PostCreatePutUpdate();
        GetSingleuser getSingleuser = new GetSingleuser();

//
//        try {
//            System.out.println(postCreatePutUpdate.addPost());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            System.out.println(postCreatePutUpdate.updateName(250));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            System.out.println(getSingleuser.singleUser(4));
//        } catch (IOException e) {
//            e.printStackTrace();

        try {
            System.out.println(postCreatePutUpdate.postRegister());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


