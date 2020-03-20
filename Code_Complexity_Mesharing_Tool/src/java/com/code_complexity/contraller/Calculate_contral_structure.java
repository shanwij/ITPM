/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code_complexity.contraller;

/**
 *
 * @author Lahiru Sanka
 */
public class Calculate_contral_structure {

    public String calculate(String redDate) {

        String codelines = "";
        int ifcount = 0;
        int forcount = 0;
        int switchcount = 0;
        int casecount = 0;
        int count = 0;
        int Ccspps = 0;
        int Ccs = 0;
        int ifWtcs = 2;
        int forWtcs = 3;
        int switchWtcs = 2;
        int caseWtcs = 1;

        for (String f_line : redDate.split("\\n")) {
//                                    f_line = f_line.split("//")[0].trim();
            count++;

            if (f_line.contains("//")) {
                String check[] = f_line.split("//");
                String str = check[0].replaceAll("\\s", "");

                if (str.equalsIgnoreCase("")) {

                    codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td></td> <td></td> <td></td> <td>0</td> </tr>" + "\n";

                } else {

                    if (str.contains("if")) {

                        ifcount++;

                        Ccspps = (ifWtcs * 1);
                        Ccs += Ccspps;
                        codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td>" + ifWtcs + "</td> <td>1</td> <td>" + Ccspps + "</td> <td>" + Ccs + "</td> </tr>" + "\n";

                    } else if (str.contains("for")) {

                        forcount++;
                        Ccspps = (forWtcs * 1);
                        Ccs += Ccspps;
                        codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td>" + forWtcs + "</td> <td>1</td> <td>" + Ccspps + "</td> <td>" + Ccs + "</td> </tr>" + "\n";

                    } else if (str.contains("switch")) {

                        switchcount++;
                        Ccspps = (switchWtcs * 1);
                        Ccs += Ccspps;
                        codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td>" + switchWtcs + "</td> <td>1</td> <td>" + Ccspps + "</td> <td>" + Ccs + "</td> </tr>" + "\n";

                    } else if (str.contains("case")) {

                        casecount++;
                        Ccspps = (caseWtcs * 1);
                        Ccs += Ccspps;
                        codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td>" + caseWtcs + "</td> <td>1</td> <td>" + Ccspps + "</td> <td>" + Ccs + "</td> </tr>" + "\n";

                    } else {
                        codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td></td> <td></td> <td></td> <td>0</td> </tr>" + "\n";

                    }

                }

            } else if (f_line.contains("if")) {

                ifcount++;

                Ccspps = (ifWtcs * 1);
                Ccs += Ccspps;
                codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td>" + ifWtcs + "</td> <td>1</td> <td>" + Ccspps + "</td> <td>" + Ccs + "</td> </tr>" + "\n";

            } else if (f_line.contains("for")) {

                forcount++;
                Ccspps = (forWtcs * 1);
                Ccs += Ccspps;
                codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td>" + forWtcs + "</td> <td>1</td> <td>" + Ccspps + "</td> <td>" + Ccs + "</td> </tr>" + "\n";

            } else if (f_line.contains("switch")) {

                switchcount++;
                Ccspps = (switchWtcs * 1);
                Ccs += Ccspps;
                codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td>" + switchWtcs + "</td> <td>1</td> <td>" + Ccspps + "</td> <td>" + Ccs + "</td> </tr>" + "\n";

            } else if (f_line.contains("case")) {

                casecount++;
                Ccspps = (caseWtcs * 1);
                Ccs += Ccspps;
                codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td>" + caseWtcs + "</td> <td>1</td> <td>" + Ccspps + "</td> <td>" + Ccs + "</td> </tr>" + "\n";

            } else {
                codelines += "<tr> <td >" + count + "</td> <td>" + f_line + "</td> <td></td> <td></td> <td></td> <td>0</td> </tr>" + "\n";

            }
        }

        return codelines;
    }

}
