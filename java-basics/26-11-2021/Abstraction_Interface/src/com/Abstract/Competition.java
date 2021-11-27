package com.Abstract;

import com.Abstract.Classical;

class Competition {
    public static void main(String[] args) {

        Competitiontype classical=new Classical();
        classical.dance();
        classical.sing();
        Competitiontype western=new Western();
        western.dance();
        western.sing();
    }
}
