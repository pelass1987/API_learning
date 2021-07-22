package reqresAPI;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        PostCreatePutUpdate postCreatePutUpdate = new PostCreatePutUpdate();
        GetSingleuser getSingleuser = new GetSingleuser();
        RegisterUser registerUser = new RegisterUser();
        NewUser newUser = new NewUser();
        UpdatedUser updatedUser = new UpdatedUser();

        registerUser.setEmail("eve.holt@reqres.in");
        registerUser.setPassword("pistol");

        newUser.setName("morpheus");
        newUser.setJob("leader");

        updatedUser.setName("morpheus");
        updatedUser.setJob("leader");



//        try {
//            System.out.println(postCreatePutUpdate.createNewUser(newUser));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            System.out.println(postCreatePutUpdate.updateName(updatedUser));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            System.out.println(getSingleuser.singleUser(4));
//        } catch (IOException e) {
//            e.printStackTrace();

//        try {
//            System.out.println(postCreatePutUpdate.postRegister(registerUser));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
    }


