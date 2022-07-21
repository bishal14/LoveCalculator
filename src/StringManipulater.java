import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringManipulater extends Application {
    TextField firstText;
    TextField secondText;
    private static LinkedList<Integer> occurence = new LinkedList<>();
    private static LinkedList<Integer> numbersWithoutZeros = new LinkedList<>();
    private static LinkedList<String> stringsWithoutRep = new LinkedList<>();


    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        HBox hbox = new HBox();

        Label loveCalculator = new Label("Love Calculator");
        hbox.getChildren().add(pane);

        Insets insets = new Insets(10);
        Label firstName = new Label("Your First Name   :");
        Label crushName = new Label("Your Crush Name :");
        firstText = new TextField();
        secondText = new TextField();
        Button calculate = new Button("Calculate");

        firstName.setPadding(insets);
        crushName.setPadding(insets);

        Image image = new Image("D:\\JavaFxproject\\JAVAFX\\fotos\\RNB.jpg");
        BackgroundImage myBI = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(myBI);

        loveCalculator.setAlignment(Pos.CENTER);
        loveCalculator.setTextFill(Color.RED);

        BorderPane borderPane = new BorderPane();

        GridPane root = new GridPane();
        root.add(firstName, 0, 0);
        root.add(firstText, 1, 0);
        root.add(crushName, 0, 1);
        root.add(secondText, 1, 1);
        root.add(calculate, 0, 3);

        root.setAlignment(Pos.CENTER);
        root.setBackground(background);
        borderPane.setTop(loveCalculator);


        calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {


                String firstName = firstText.getText().toLowerCase();
                String secondName = secondText.getText().toLowerCase();


                stringProcess(firstName, secondName);

                // MainClass.calculatePercent(eliminateZeros(occurence));

                System.out.println("Hello you click Me, dnt click Me .");


            }

        });
        Scene scene = new Scene(root, 700, 700);
        primaryStage.setTitle("Love Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static String printYes() {
        return "Yesssss!!!!!!!!!!!!";
    }


    public static String stringProcess(String yourName, String crushName) {

        String concateName = yourName.concat("loves").concat(crushName);
        String testar[] = concateName.split("");


        ArrayList<String> wordList = new ArrayList<String>();
        ArrayList<String> repetion = new ArrayList<>();
        ArrayList ds = new ArrayList();
        ArrayList<Integer> repeatIndex = new ArrayList<>();
        //ds.
        for (String s : testar) {
            wordList.add(s);
            repetion.add(s);
        }
        System.out.println(wordList.toString());
        //eliminateRepetition(wordList);
        System.out.println(stringsWithoutRep.toString());


        boolean occurenceRepetion = false;
        int insidei, insidej, mulitply = 0;
        int count = 0;
        int countMinusOne = -1;
        for (int i = 0; i < wordList.size(); i++) {
            count = 0;

            for (int j = 0; j < wordList.size(); j++) {



                /*
                if (repetion.get(i).equals(wordList.get(j))) {

                    countMinusOne++;
                    if(countMinusOne>=0){
                        repeatIndex.add(j);
                    }
                }





                 for(int x =0;i<repeatIndex.size();i++){
                     repetion.remove(repeatIndex.get(x));

                 }


                System.out.println("-------->"+repetion.toString());
                System.out.println("--------repeat index >"+repeatIndex.toString());
                System.out.println(repetion.size()+",--->>>>>"+wordList.size());
                System.out.println("--------->"+wordList.toString());
*/
                if (repetion.get(i).equals(wordList.get(j))) {
                    occurenceRepetion = true;
                    count++;
                    System.out.println();
                    wordList.remove(j);

                }

            }
            //  System.out.println("count is hier --->" + count);
            if (occurenceRepetion) {
                occurence.add(count);
            } else {
                occurence.add(1);
            }
            System.out.println();
        }

        System.out.println("occurence size is " + occurence.size() + ", " + occurence.toString());


        System.out.println("occurence size is " + occurence.size() + ", " + occurence.toString());

        return concateName;
    }

    public boolean checkValidation(String firstName, String curshName) {


        if (curshName.contains("") || firstName.contains("")) {
            return false;
        }

        return false;
    }


    public boolean containNoNumber(String firstName, String crushName) {
        char[] checkFirstName = firstName.toCharArray();
        char[] checkCrushName = crushName.toCharArray();


        for (int i = 0; i < firstName.length(); i++) {
            if (Character.isDigit(checkFirstName[i])) {
                return false;
            }

        }
        for (int i = 0; i < firstName.length(); i++) {

            if (Character.isDigit(checkCrushName[i])) {
                return false;

            }
        }


        return true;
    }

}
