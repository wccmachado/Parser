

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.source.tree.WhileLoopTree;

import data.InformationFile;
import data.VarTypes;

public class TestForm {
	//static EG1 parser = null;
	static InformationFile informationFiles = new InformationFile();
	
	public static void main(String[] args) {
		JFrame guiFrame = new JFrame();
       
        //make sure  the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Example GUI");
        guiFrame.setSize(300,600);
      
        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);
        
        //The first JPanel contains a label and text field for entering the expression
        final JPanel inputPanel = new JPanel();
        JLabel inputLbl = new JLabel("Enter your Expression: ");
        final JTextField inputText = new JTextField("");
        inputText.setColumns(20);
        
        inputPanel.add(inputLbl);
        inputPanel.add(inputText);
        
		// The bottom Panel contains a text box for showing results of a parse
        final JTextArea outputText = new JTextArea();
        outputText.setColumns(20);
        outputText.setRows(10);
        
        JPanel mainPanel = new JPanel();
        mainPanel.add(inputPanel);
        mainPanel.add(outputText);
        
        // Textfield Action Listener callback - executed when user hits "return"
        inputText.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
                String sentence = inputText.getText();
                // Put parens around sentence so that parser knows scope
                sentence =  "teste.pddl";// "(" + sentence + ")";
                File domainFile = new File("/home/wccmachado/eclipse-workspace/Parser/Domain/Rover/domain.pddl");
                File problemFile = new File("/home/wccmachado/eclipse-workspace/Parser/Domain/Rover/p02.pddl");
                System.out.println("  ---->  Sentence   ");
                FileReader domain = null;
                FileReader problem = null;
            
               
				//try {
					//domain = new FileReader(domain);
					//problem = new FileReader(problem);
					informationFiles = EG1.parseFiles(domainFile, problemFile);
				//} catch (IOException e1) {
					// TODO Auto-generated catch block
				//	e1.printStackTrace();
				//}
					//String domain = 
				
				 outputText.setText("Dominio:  "+ informationFiles.domainName + "Problema é:" + informationFiles.defineProblemMap + "\n");
				 
//				if(parser == null) 
//				{
//				  System.out.println("  ---->  Teste 2  ");
//				  //parser = new EG1(is);
//				   System.out.println("  ---->  Teste1   ");
//				}
//				else EG1.ReInit(is);
//                try
//                {
//                	System.out.println(" -----> "+"Aqui");
//                	if (EG1.parseDomain()) {               		
//                		
//                	   Set teste = informationFiles.getRequirements();
//                	   Iterator itr  = teste.iterator();
//                	   String output="";
//                	   while (itr.hasNext()) {
//                		   
//                		  output = output+ " "+ itr.next() + "\n";
//						
//					}
//                	   Set teste1 = informationFiles.getTypes();
//                	   Iterator itr1  = teste1.iterator(); 
//                	   System.out.println("Tamanho  -> " + teste1.size());
//                	   while (itr1.hasNext()) {
//                		   
//                		  output = output+ " "+ itr1.next() + "\n";
//						
//					}
//                	   Map predicatesMap = informationFiles.predicatesMap;
//                	   System.out.println("Tamanho  -> " + informationFiles.defineProblemMap.size());
//                	   
//                	   Set key = predicatesMap.keySet();
//                	  
//                	   Iterator itr2  = key.iterator();                	 
//                	   while (itr2.hasNext()) {
//                		   String temp = (String)itr2.next();
//                		  List<VarTypes> aux = (List<VarTypes>)predicatesMap.get(temp); 
//                		  Iterator<VarTypes> aux1 = aux.iterator();
//                		  String aux3="";
//                		  while(aux1.hasNext())
//                		  {
//                			  VarTypes auxVar = aux1.next();
//                			  
//                			  aux3=auxVar.relationshipVarAndType();
//                		  }
//                		 
//                		   
//                		  output = output+ " "+ temp + aux3 + "\n";
//                		  //"Domain é:" + parser.IP.domainName + "\n"+ output 
//						
//					}
//                	   
//                	   outputText.setText("Domain é:" + parser.IP.domainName + "\n"+ output);
//                    	
//                    	
//						
//					}
//                  switch (EG1.start())
//                  {
//                    case 0 :
//                    	outputText.setText("expression parsed ok.");
//                    	outputText.setText("Domain é:" + parser.IP.domainName);
//                    
//                    break;
//                    default :
//                    break;
//                  }
//                }
//                catch (Exception e)
//                {
//                  outputText.setText("error in expression.\n"+
//                		  				e.getMessage());
//                }
//                catch (Error e)
//                {
//                 outputText.setText("error in expression.\n"+
//    		  						   e.getMessage());
//                }
//                finally
//                {
//                  
//                }
        	}
        });

        guiFrame.add(mainPanel, BorderLayout.NORTH);
        guiFrame.add(outputText, BorderLayout.CENTER);
        // Layout all component panels
        guiFrame.pack();
        
        //make sure the JFrame is visible
        guiFrame.setVisible(true);
	}

}