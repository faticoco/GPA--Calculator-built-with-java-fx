package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("cgpa calculator");
        StackPane layout = new StackPane();

       


        GridPane v = new GridPane();
        v.setAlignment(Pos.CENTER);
        v.setPadding(new Insets(20, 20, 20, 20));
        Text l0 = new Text(20 , 20 , "CGPA calculator");
        l0.setFont(Font.font ("Verdana", 40));
        l0.setFill(Color.BLUE);
        Text l1 = new Text(5 , 20 , "Courses");
        Label L1 = new Label("Grade      ");
        Label ll1 = new Label("Credit hours      ");
        TextField t1 = new TextField();
        TextField T1 = new TextField();
        TextField tt1 = new TextField();

        TextField t2 = new TextField();
        TextField T2 = new TextField();
        TextField tt2 = new TextField();

        TextField t3 = new TextField();
        TextField T3 = new TextField();
        TextField tt3 = new TextField();

        TextField t4 = new TextField();
        TextField T4 = new TextField();
        TextField tt4 = new TextField();

        TextField t5 = new TextField();
        TextField T5 = new TextField();
        TextField tt5 = new TextField();

        TextField t6 = new TextField();
        TextField T6 = new TextField();
        TextField tt6 = new TextField();

        TextField t7 = new TextField();
        TextField T7 = new TextField();
        TextField tt7 = new TextField();

        Label L8 = new Label("previous gpa      ");
        Label L9 = new Label("previous Credits      ");
        TextField t8 = new TextField();
        TextField t9 = new TextField();
        
        Button b= new Button("Calculate");

        Label L10 = new Label("cgpa      ");
       

        v.addRow(1, l0);

        v.addRow(2, l1);
        v.addRow(2, L1);
        v.addRow(2, ll1);
        Text lt1= new Text();
        Text Lt1= new Text();
        Text llt1= new Text();

        v.addRow(3, t1);
        v.addRow(3, T1);
        v.addRow(3, tt1);

        
        Text lt2= new Text();
        Text Lt2= new Text();
        Text llt2= new Text();


        v.addRow(4, t2);
        v.addRow(4, T2);
        v.addRow(4, tt2);

        
        Text lt3= new Text();
        Text Lt3= new Text();
        Text llt3= new Text();

        v.addRow(5, t3);
        v.addRow(5, T3);
        v.addRow(5, tt3);
        

        
        Text lt4= new Text();
        Text Lt4= new Text();
        Text llt4= new Text();


        v.addRow(6, t4);
        v.addRow(6, T4);
        v.addRow(6, tt4);

        
        Text lt5= new Text();
        Text Lt5= new Text();
        Text llt5= new Text();

        v.addRow(7, t5);
        v.addRow(7, T5);
        v.addRow(7, tt5);

        
        Text lt6= new Text();
        Text Lt6= new Text();
        Text llt6= new Text();


        v.addRow(8, t6);
        v.addRow(8, T6);
        v.addRow(8, tt6);


        Text lt7= new Text();
        Text Lt7= new Text();
        Text llt7= new Text();

        v.addRow(9, t7);
        v.addRow(9, T7);
        v.addRow(9, tt7);

        
      
        v.addRow(10, L8);
        v.addRow(10, t8);
        Text lt8= new Text();

        v.addRow(11, L9);
        v.addRow(11, t9);
        Text lt9= new Text();
        
        v.addRow(12, b);
        
        
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double grade1;
                double grade2;
                double grade3;
                double grade4;
                double grade5;
                double grade6;
                double grade7;


                lt1.setText(t1.getText().toString());
                Lt1.setText(T1.getText().toString());
                llt1.setText(tt1.getText().toString());
                
              
                
                lt2.setText(t2.getText().toString());
                Lt2.setText(T2.getText().toString());
                llt2.setText(tt2.getText().toString());
                
                lt3.setText(t3.getText().toString());
                Lt3.setText(T3.getText().toString());
                llt3.setText(tt3.getText().toString());
                
                lt4.setText(t4.getText().toString());
                Lt4.setText(T4.getText().toString());
                llt4.setText(tt4.getText().toString());
                
                lt5.setText(t5.getText().toString());
                Lt5.setText(T5.getText().toString());
                llt5.setText(tt5.getText().toString());
                
                lt6.setText(t6.getText().toString());
                Lt6.setText(T6.getText().toString());
                llt6.setText(tt6.getText().toString());
                
                lt7.setText(t7.getText().toString());
                Lt7.setText(T7.getText().toString());
                llt7.setText(tt7.getText().toString());
                
                
                lt8.setText(t8.getText().toString());
                lt9.setText(t9.getText().toString());

             
                 //credits
             
                int credit1 =  Integer.parseInt(llt1.getText());
                int credit2 =  Integer.parseInt(llt2.getText());

             
                int credit3 =  Integer.parseInt(llt3.getText());

             
                int credit4 =  Integer.parseInt(llt4.getText());

              
                int credit5 =  Integer.parseInt(llt5.getText());

              
                int credit6 =  Integer.parseInt(llt6.getText());

                
                int credit7 = Integer.parseInt(llt7.getText());

                double PREV_GPA = Double.parseDouble(lt8.getText());
                Integer PREV_CREDITS= Integer.parseInt(lt9.getText());;
               
                if(Lt1.getText().equals("A")) 
                {
                    grade1= 4.00;
                }

                else if(Lt1.getText().equals("A-"))

                {

                    grade1= 3.67;

                }

                else if(Lt1.getText().equals("B+"))

                {

                    grade1=3.33;
 
                }

                else if(Lt1.getText().equals("B"))

                {

                    grade1=3.00;

                }

                else if(Lt1.getText().equals("B-"))

                {

                    grade1=2.67;

                }

                else if(Lt1.getText().equals("C+"))

                {

                    grade1=2.33;

                }

                else if(Lt1.getText().equals("C"))

                {

                    grade1=2.00;
                }

                else if(Lt1.getText().equals("C-"))

                {

                    grade1=1.67;
                }

                else if(Lt1.getText().equals("D"))

                {

                    grade1=1.33;

                }

                else

                {

                    grade1=0;

                }
              
                               



                if(Lt2.getText().equals("A")) 
                {
                    grade2= 4.00;
                }

                else if(Lt2.getText().equals("A-"))

                {

                    grade2= 3.67;

                }

                else if(Lt2.getText().equals("B+"))

                {

                    grade2= 3.33;

                }

                else if(Lt2.getText().equals("B"))

                {

                    grade2= 3.00;

                }

                else if(Lt2.getText().equals("B-"))

                {


                    grade2= 2.67;
                }

                else if(Lt2.getText().equals("C+"))

                {

                    grade2= 2.33;

                }

                else if(Lt2.getText().equals("C"))

                {

                    grade2= 2.00;
                }

                else if(Lt2.getText().equals("C-"))

                {

                    grade2= 1.67;
                }

                else if(Lt2.getText().equals("D"))

                {


                    grade2= 1.33;
                }

                else

                {

                    grade2= 0.00;

                }
              



                
                if(Lt3.getText().equals("A")) 
                {
                    grade3= 4.00;
                }

                else if(Lt3.getText().equals("A-"))

                {

                    grade3= 3.67;

                }

                else if(Lt3.getText().equals("B+"))

                {

                    grade3= 3.33;

                }

                else if(Lt3.getText().equals("B"))

                {

                    grade3= 3.00;

                }

                else if(Lt3.getText().equals("B-"))

                {


                    grade3= 2.67;
                }

                else if(Lt3.getText().equals("C+"))

                {

                    grade3= 2.33;

                }

                else if(Lt3.getText().equals("C"))

                {

                    grade3= 2.00;
                }

                else if(Lt3.getText().equals("C-"))

                {

                    grade3= 1.67;
                }

                else if(Lt3.getText().equals("D"))

                {


                    grade3= 1.33;
                }

                else

                {

                    grade3= 0.00;

                }
              




                
                if(Lt4.getText().equals("A")) 
                {
                    grade4= 4.00;
                }

                else if(Lt4.getText().equals("A-"))

                {

                    grade4= 3.67;

                }

                else if(Lt4.getText().equals("B+"))

                {

                    grade4= 3.33;

                }

                else if(Lt4.getText().equals("B"))

                {

                    grade4= 3.00;

                }

                else if(Lt4.getText().equals("B-"))

                {


                    grade4= 2.67;
                }

                else if(Lt4.getText().equals("C+"))

                {

                    grade4= 2.33;

                }

                else if(Lt4.getText().equals("C"))

                {

                    grade4= 2.00;
                }

                else if(Lt4.getText().equals("C-"))

                {

                    grade4= 1.67;
                }

                else if(Lt4.getText().equals("D"))

                {


                    grade4= 1.33;
                }

                else

                {

                    grade4= 0.00;

                }
              




                
                if(Lt5.getText().equals("A")) 
                {
                    grade5= 4.00;
                }

                else if(Lt5.getText().equals("A-"))

                {

                    grade5= 3.67;

                }

                else if(Lt5.getText().equals("B+"))

                {

                    grade5= 3.33;

                }

                else if(Lt5.getText().equals("B"))

                {

                    grade5= 3.00;

                }

                else if(Lt5.getText().equals("B-"))

                {


                    grade5= 2.67;
                }

                else if(Lt5.getText().equals("C+"))

                {

                    grade5= 2.33;

                }

                else if(Lt5.getText().equals("C"))

                {

                    grade5= 2.00;
                }

                else if(Lt5.getText().equals("C-"))

                {

                    grade5= 1.67;
                }

                else if(Lt5.getText().equals("D"))

                {


                    grade5= 1.33;
                }

                else

                {

                    grade5= 0.00;

                }
              



                
                if(Lt6.getText().equals("A")) 
                {
                    grade6= 4.00;
                }

                else if(Lt6.getText().equals("A-"))

                {

                    grade6= 3.67;

                }

                else if(Lt6.getText().equals("B+"))

                {

                    grade6= 3.33;

                }

                else if(Lt6.getText().equals("B"))

                {

                    grade6= 3.00;

                }

                else if(Lt6.getText().equals("B-"))

                {


                    grade6= 2.67;
                }

                else if(Lt6.getText().equals("C+"))

                {

                    grade6= 2.33;

                }

                else if(Lt6.getText().equals("C"))

                {

                    grade6= 2.00;
                }

                else if(Lt6.getText().equals("C-"))

                {

                    grade6= 1.67;
                }

                else if(Lt6.getText().equals("D"))

                {


                    grade6= 1.33;
                }

                else

                {

                    grade6= 0.00;

                }
              


              
                if(Lt7.getText().equals("A")) 
                {
                    grade7= 4.00;
                }

                else if(Lt7.getText().equals("A-"))

                {

                    grade7= 3.67;

                }

                else if(Lt7.getText().equals("B+"))

                {

                    grade7= 3.33;

                }

                else if(Lt7.getText().equals("B"))

                {

                    grade7= 3.00;

                }

                else if(Lt7.getText().equals("B-"))

                {


                    grade7= 2.67;
                }

                else if(Lt6.getText().equals("C+"))

                {

                    grade7= 2.33;

                }

                else if(Lt6.getText().equals("C"))

                {

                    grade7= 2.00;
                }

                else if(Lt6.getText().equals("C-"))

                {

                    grade7= 1.67;
                }

                else if(Lt6.getText().equals("D"))

                {


                    grade7= 1.33;
                }

                else

                {

                    grade7= 0.00;

                }
              
                double SUM_CREDITS= credit1+credit2+credit3+ credit4+credit5+credit6+credit7;
                double sgpa = ((credit1 *grade1)+(credit2 *grade2) +(credit3 *grade3) + (credit4 *grade4) + (credit5 *grade5)+ (credit6 *grade6)+ (credit7 *grade7))/SUM_CREDITS;
             
              
                

                double CGPA = ((PREV_GPA* PREV_CREDITS )+(sgpa*SUM_CREDITS))/ (PREV_CREDITS+SUM_CREDITS);
                Text t10 = new Text(String.valueOf("    "+CGPA));
               
                v.addRow(12, new Text(" "));
                v.addRow(13, L10);
                v.addRow(13, t10);




                //HANDLING THE file

                File f= new File("demo\\src\\main\\java\\com\\example\\Grades.txt");
                
                try (FileWriter fw = new FileWriter(f )) {
                    
                   fw.write(lt1.getText() +" "+ Lt1 .getText()+" "+llt1  .getText()+"\n");
                   fw.write(lt2.getText() +" "+ Lt2 .getText()+" "+llt2 .getText() +"\n");

                    fw.write(lt3.getText() +" "+ Lt3 .getText()+" "+llt3 .getText() +"\n");
                    fw.write(lt4 .getText()+" "+ Lt4 .getText()+" "+llt4  .getText()+"\n");

                    fw.write(lt5 .getText()+" "+ Lt5 .getText()+" "+llt5 .getText() +"\n");
                    fw.write(lt6 .getText()+" "+ Lt6 .getText()+" "+llt6  .getText()+"\n");

                    fw.write(lt7 .getText()+" "+ Lt7 .getText()+" "+llt7 .getText() + "\n");
                    

            
                    fw.write("Previous GPA:   " +PREV_GPA   +"\n");

                    fw.write("Previous credits:   " +PREV_CREDITS  +"\n");

                    fw.write("CGPA:  " +CGPA +"\n");

                   fw.close();
                
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
             
                
            }
        });
       

       
      
        layout.getChildren().add(v);
        Scene scene3 = new Scene(layout, 600, 650);

        stage.setScene(scene3);

        stage.show();

       
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}



