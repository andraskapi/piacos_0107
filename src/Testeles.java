import java.util.ArrayList;
import java.util.List;

public class Testeles {
    public static void main(String[] args) {
        List<String> piacLista = Beolvaso.reader("piac.txt");
        List<Tojas> tojasok = new ArrayList<>();
        for(var line : piacLista){
            String[] lineAsArray = line.split(";");
            tojasok.add(new Tojas(lineAsArray[0],lineAsArray[1],Integer.parseInt(lineAsArray[2]),
                    Boolean.parseBoolean(lineAsArray[3]),lineAsArray[4]));
        }
        System.out.println(tojasok.size());
    }
}
