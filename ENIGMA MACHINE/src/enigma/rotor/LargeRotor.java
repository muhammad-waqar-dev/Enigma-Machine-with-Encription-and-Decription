
package enigma.rotor;



import enigma.rotor.Rotor;

public class LargeRotor extends Rotor{
    @Override
    public void setAlphabet()
    {
    int  i = 0;

        rotor[i++] = ' ';
        

        rotor[i++] = 'B';
        

        rotor[i++] = 'D';
        

        rotor[i++] = 'F';
        

        rotor[i++] = 'H';
        

        rotor[i++] = 'J';
        

        rotor[i++] = 'L';
        

        rotor[i++] = 'N';
        

        rotor[i++] = 'P';
        

        rotor[i++] = 'R';
        

        rotor[i++] = 'T';
        

        rotor[i++] = 'V';
        

        rotor[i++] = 'X';
        

        rotor[i++] = 'Z';
        

        rotor[i++] = 'A';
        

        rotor[i++] = 'C';
        

        rotor[i++] = 'E';
        

        rotor[i++] = 'G';
        

        rotor[i++] = 'I';
        

        rotor[i++] = 'K';
        

        rotor[i++] = 'M';
        

        rotor[i++] = 'O';
        

        rotor[i++] = 'Q';
        

        rotor[i++] = 'S';
        

        rotor[i++] = 'U';
        

        rotor[i++] = 'W';
        

        rotor[i] = 'Y';

    System.out.println("Finished Initialising Large Rotor  i="+i);
    }
}