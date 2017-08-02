
package enigma.rotor;



import enigma.rotor.Rotor;

public class MedRotor extends Rotor {
    @Override
    public void setAlphabet()
    {
    int i = 0; 

    rotor[i++] = ' ';
    

    rotor[i++] = 'E';
    

    rotor[i++] = 'J';
    

    rotor[i++] = 'O';
    

    rotor[i++] = 'T';
    

    rotor[i++] = 'Y';
    

    rotor[i++] = 'C';
    

    rotor[i++] = 'H';
    

    rotor[i++] = 'M';
    

    rotor[i++] = 'R';
    

    rotor[i++] = 'W';
    

    rotor[i++] = 'A';
    

    rotor[i++] = 'F';
    

    rotor[i++] = 'K';
    

    rotor[i++] = 'P';
    

    rotor[i++] = 'U';
    

    rotor[i++] = 'Z';
    

    rotor[i++] = 'D';
    

    rotor[i++] = 'I';
    

    rotor[i++] = 'N';
    

    rotor[i++] = 'S';
    

    rotor[i++] = 'X';
    

    rotor[i++] = 'B';
    

    rotor[i++] = 'G';
    

    rotor[i++] = 'L';
    

    rotor[i++] = 'Q';
    

    rotor[i] = 'V';

    System.out.println("Finished Initialising Med Rotor  i="+i);
    }
}