/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code_complexity.contraller;

import java.io.IOException;


/**
 *
 * @author Lakshan Wijewardana
 */
public class Calculate_size {
      
      public String calculate(String readData) {
         
          
       /* String statementLine;
	String[] keyWords = { "abstract", "assert", "break", "catch", "class", "const", "continue", "default", "do",
				"else", "enum", "extends", "final", "finally", "goto", "implements", "import", "instanceof",
				"interface", "native", "new", "package", "private", "protected", "public", "return", "static",
				"strictfp", "super", "synchronized", "this", "throw", "throws", "transient", "try", "void",
				"volatile" };
	String[] idKey = { "boolean", "double", "float", "int", "long", "String", "void", "print", "println", "out",
				"System", "Scanner", "class", "extends", "implements" };
	String[] operators = { "+", "-", "*", "/", "%", "++", "--", "==", "!=", ">=", "<", ">", "<=", "&&", "||", "!",
				"|", "^", "~", "<<", ">>", ">>>", "<<<", "->", "::", "+=", "-=", "*=", "/=", "=", ">>>=", "|=", "&=",
				"%=", "<<=", ">>=", "^=" };
	int Cs = 0, Wkw = 1, Nkw = 0, Wid = 1, Nid = 0, Wop = 1, Nop = 0, Wnv = 1, Nnv = 0, Wsl = 1, Nsl = 0;
	int lineNo = 1;
		
	StringBuilder sb = new StringBuilder();
	sb.append("<html>");
	sb.append("<head>");
	sb.append("</head>");

	for (String f_line : readData.split("\\n")) {

			// System.out.println(f.getName());

			
			   
			  sb.append("<table class = \"table\">");
			  sb.append("<thead>");
			  sb.append("<tr>");
			  sb.append("<th scope=\"col\">Line No.</th>"); 
			  sb.append("<th scope=\"col\">Program Statement</th>");
			  sb.append("<th scope=\"col\">Nkw</th>");
			  sb.append("<th scope=\"col\">Nid</th>");
			  sb.append("<th scope=\"col\">Nop</th>"); 
			  sb.append("<th scope=\"col\">Nnv</th>");
			  sb.append("<th scope=\"col\">Nsl</th>"); 
			  sb.append("<th scope=\"col\">Cs</th>");
			  sb.append("</tr>");
			  sb.append("</thead>");

                          while (f_line != null) {
                              sb.append("<tbody>");
                              sb.append("<tr>");
                              System.out.print(lineNo);
                              sb.append("<td>" +lineNo);
                              sb.append("</td>");
                              System.out.print("\t");
                              System.out.print(f_line);
                              sb.append("<td>" +f_line);
                              sb.append("</td>");
                              
                              statementLine = f_line;
                              String[] arrOfStr = statementLine.split("[() ,.;/&\\s]+");
                              
                              // check each word one by one
                              for (String check : arrOfStr) {
                                  // System.out.println(check);
                                  // Checking for keywords
                                  for (String element : keyWords) {
                                      // System.out.print(check);
                                      if (element.equals(check) || check.equals("\t \t" + element)) {
                                          
                                          Nkw++;
                                          
                                      }
                                      
                                  }
                                  // check identifiers
                                  for (String id : idKey) {
                                      
                                      if (id.equals(check) || check.equals("\t" + id)) {
                                          
                                          Nid++;
                                      }
                                      
                                  }
                                  
                                  // check for operators
                                  for (String op : operators) {
                                      // System.out.println(check);
                                      if (op.equals(check)) {
                                          
                                          Nop++;
                                          
                                      }
                                      
                                  }
                                  
                                  // check for numeric values
                                  
                                  boolean numeric = true;
                                  
                                  numeric = check.matches("-?\\d+(\\.\\d+)?");
                                  
                                  if (numeric) {
                                      
                                      Nnv++;
                                      
                                  }
                                  
                              }
                              
                              // check for strings
                              if (f_line.contains("\"")) {
                                  
                                  Nsl++;
                                  
                              }
                              
                              Cs = (Wkw * Nkw) + (Wid * Nid) + (Wop * Nop) + (Wnv * Nnv) + (Wsl * Nsl);
                              
                              
                              System.out.print("\t");
                              System.out.print(Nkw);
                              
                              sb.append("<td>" +Nkw);
                              sb.append("</td>");
                              
                              System.out.print("\t");
                              System.out.print(Nid);
                              
                              sb.append("<td>" +Nid);
                              sb.append("</td>");
                              
                              System.out.print("\t");
                              System.out.print(Nop);
                              
                              sb.append("<td>" +Nop);
                              sb.append("</td>");
                              
                              System.out.print("\t");
                              System.out.print(Nnv);
                              
                              sb.append("<td>" +Nnv);
                              sb.append("</td>");
                              
                              System.out.print("\t");
                              System.out.print(Nsl);
                              
                              sb.append("<td>" +Nsl);
                              sb.append("</td>");
                              
                              sb.append("<td>" +Cs);
                              sb.append("</td>");
                              // reads next line
                              
                              lineNo++;
                              System.out.println();
                              Nkw = 0;
                              Nid = 0;
                              Nop = 0;
                              Nnv = 0;
                              Nsl = 0;
                              sb.append("</tr>");
                              sb.append("</tbody>");
                          }

			
			  sb.append("</table>");
			  

		}
		
		sb.append("</body>"); 
		sb.append("</html>");
          return null;


*/        String codelines = "";
int count = 0;
      
       
         for (String f_line : readData.split("\\n")) {
//                                    f_line = f_line.split("//")[0].trim();
            count++;
             codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td></td> <td></td> <td></td> <td>0</td> </tr>" + "\n";

      
         }
          return codelines;
    }
      

}
