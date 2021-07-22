package api.endpoint;

import NextGenEndpoints.Assignment;

import java.io.IOException;

public class MainTests {

    public static void main(String[] args) throws IOException {

        Assignment assignment = new Assignment();
        System.out.println(assignment.getAssigment());

    }
}
