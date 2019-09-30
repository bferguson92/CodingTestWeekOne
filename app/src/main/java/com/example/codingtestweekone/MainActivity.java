package com.example.codingtestweekone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean armNum1 = isArmstrong(153);
        boolean armNum2 = isArmstrong(32);
        Log.d("ARMSTR", armNum1 + " " + armNum2);
        int[] values = new int[]{3,3,4,4,5,5,5,5,6,2};
        int num = mostOccurrences(values);
        Log.d("OCRD", Integer.toString(num));


        Room[][] verticalTrue = new Room[][] {
                {new Room(false), new Room(false), new Room(false), new Room(false),
                        new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false),
                        new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false),
                        new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true),
                        new Room(true), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false),
                        new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false),
                        new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false),
                        new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false),
                        new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false),
                        new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false),
                        new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }
        };

        boolean vTrue = isOutbreak(verticalTrue);

        Log.d("ROOM", String.valueOf(vTrue));
    }

    public int mostOccurrences(int[] values){
        int currentCount = 0;
        int mostOccurred = 0;
        int returnNum = 0;

        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < values.length; j++){
                if(values[i] == values[j]){
                    currentCount++;
                }
            }

            if(currentCount > mostOccurred) {
                mostOccurred = currentCount;
                returnNum = values[i];
            }

            currentCount = 0;
        }

        return returnNum;
    }

    public boolean isArmstrong(int num){
        String numStr = Integer.toString(num);
        int[] armStrongNums = new int[numStr.length()];
        int armNum = 0;

        for(int i = 0; i < numStr.length(); i++){
            armStrongNums[i] = Character.getNumericValue(numStr.charAt(i));
            armNum += Math.pow(armStrongNums[i], 3);
            Log.d("ARMSTR", Integer.toString(armNum));
        }

        if(armNum == num){
            return true;
        }

        return false;
    }

    public static boolean isOutbreak(Room[][] floor){
        return false;
    }
}
