import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// String concat
//String repetition count
//

public class MainClass extends Application {
    TextField firstText;
    TextField secondText;
    private Scene scene;
    private Stage firstStage;
    private Stage secondStage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label loveCalculator = new Label("Love Calculator");


        Insets insets = new Insets(10);
        Label firstName = new Label("Your First Name   :");
        firstName.setTextFill(Color.RED);


        Label crushName = new Label("Your Crush Name :");
        crushName.setTextFill(Color.RED);
        crushName.setStyle("-fx-font-weight:bold;" +
                " -fx-font-size:20px; " +
                "-fx-font-color: red;" +
                "-fx-font-family: Times New Roman");
        firstName.setStyle("-fx-font-weight:bold;" +
                "-fx-font-size:20px;" +
                "-fx-font-family:Times New Roman");

        firstText = new TextField();
        secondText = new TextField();


        Button calculate = new Button("Calculate");
        Button exchange = new Button("<--->");
        Button createScene = new Button("createScene");


        calculate.setStyle(
                "-fx-text-color: red;" +
                        "-fx-font-size:20px;" +
                        "-fx-width:20px;" +
                        "-fx-text-align:center;" +
                        "-fx-cursor:crosshair;"
        );
        calculate.setTextFill(Color.RED);

        firstName.setPadding(insets);
        crushName.setPadding(insets);

        Image image = new Image("D:\\JavaFxproject\\JAVAFX\\fotos\\RNB.jpg");

        BackgroundImage myBI = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
        Background background = new Background(myBI);
        //background at the center


        loveCalculator.setAlignment(Pos.CENTER);
        loveCalculator.setTextFill(Color.RED);

        BorderPane borderPane = new BorderPane();


        GridPane root = new GridPane();
        root.add(firstName, 0, 0);
        root.add(firstText, 1, 0);
        root.add(crushName, 0, 1);
        root.add(secondText, 1, 1);
        root.add(calculate, 0, 3);
        root.add(exchange, 0, 4);




        ChoiceBox<String> choices = new ChoiceBox<>();
        ObservableList<String> list = choices.getItems();
        list.addAll("Calendar", "Gym Routine", "Calorie", "Love Calculator");

        Menu  file = new Menu("File");
        Menu help = new Menu("Help");
        Menu save = new Menu("Save");
        MenuBar menuBar = new MenuBar(file,help,save);
        HBox hbox = new HBox();

        hbox.getChildren().add(menuBar);
        hbox.getChildren().add(root);
        //Scene scene1 = new Scene(hbox,800,800);






        MenuItem programms = new MenuItem("Programms");
        MenuItem calendar = new MenuItem("Calendar");
        MenuItem gymNutrition = new MenuItem("Programms");
        MenuItem gymRoutine = new MenuItem("Programms");

        root.add(choices, 1, 2);
        root.add(createScene, 1, 4);


        root.setAlignment(Pos.CENTER);
        root.setBackground(background);
        borderPane.setTop(loveCalculator);
        scene = new Scene(hbox, 700, 700);



        calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {


                String firstName = firstText.getText().toLowerCase();
                String secondName = secondText.getText().toLowerCase();

                // stringProcess(firstName, secondName);

                //MainClass.calculatePercent(eliminateZeros(occurence));

                TextArea area = new TextArea();

                area.setText(firstName.concat("loves").concat(secondName));
                System.out.println("Hello you click Me, dnt click Me .");


            }

        });

        exchange.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String firstName = firstText.getText().toLowerCase();
                String secondName = secondText.getText().toLowerCase();

                String flag = firstName;
                firstText.setText(secondName);
                secondText.setText(firstName);

                System.out.println("Exchange has done!!");

            }
        });
        createScene.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                HBox box = new HBox();
                TextArea ta = new TextArea("New Label in new Scene");
                box.getChildren().add(ta);
                scene = new Scene(box);
                createFirstStage(primaryStage);
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        });
        primaryStage.setTitle("Love Calculator");
        primaryStage.setScene(scene);
       // primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

        String x = "";
        String xx = "          ";
        String y = "123ddh";
        String yy = "1";
        String yyy = "iiiiopo hjjk";
        String xxx = "jjdkk234";
        String xxxx = "jjdkk234 ";
        System.out.println("lenght of x and xx are " + x.length() + ", and of xx is " + xx.length());
        MathematikProcess mp = new MathematikProcess();
        StringManipulater smp = new StringManipulater();

        System.out.println(smp.checkValidation(x, xx));
        System.out.println(smp.checkValidation(x, "Bishal"));
        System.out.println(smp.checkValidation("Bishal", xx));

        StringManipulater strmp = new StringManipulater();

    }


    public void createFirstStage(Stage stage) {

        HBox hBox = new HBox();

        Button button = new Button("go to Stage2");
        hBox.getChildren().add(button);
        stage.setScene(scene);
        stage.show();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                createSecondStage(stage);

            }
        });
    }

    public void createSecondStage(Stage stage) {
        VBox vbox = new VBox();
        Button button1 = new Button("go to Stage 1");
        Button button2 = new Button("functionless Button");
        vbox.getChildren().addAll(button1, button2);
        stage.setScene(scene);
        stage.show();
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                createFirstStage(stage)
                ;
            }
        });

    }


}








