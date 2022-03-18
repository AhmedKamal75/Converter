package code;

import java.io.*;

public class M {
    static converter parser = null;

    public static void main(String[] args) throws FileNotFoundException {

        String st;
        String ste = "";
        String fileLocation = "C:\\Users\\ALmostafa\\eclipse-workspace\\Converter\\src\\code\\dictionary.txt";


        Test test = new Test();
        File file = new File(fileLocation);
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            while ((st = br.readLine()) != null) {
                InputStream is = new ByteArrayInputStream(st.getBytes());
                if (parser == null) parser = new converter(is);
                else converter.ReInit(is);

                System.out.println(st.toString());
                String string = "this is from me: " + converter.words();
//                System.out.println(string);
                //System.out.println(test.transform(st));

            }

        } catch (IOException e) {

            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Wrong command !!");
            System.out.println(e.toString());

            //e.printStackTrace();
        }
    }

}

