package com.example.demo;

public class Admin {

    private UserManager usermanager;


    public void verifyDriver() {
        if(usermanager.getUser() instanceof Driver)
        {
            if(((Driver) usermanager.getUser()).isPending())
            {
                ((Driver) usermanager.getUser()).setPending(false);
                System.out.println("admin has accepted your registeration");
            }
        }
    }

    public void listDriverPendingRegisteration() {
        for(int i=0; i< usermanager.getPendingReg().size(); i++)
        {
            System.out.println(usermanager.getPendingReg().get(i).getName());
        }
    }
}
