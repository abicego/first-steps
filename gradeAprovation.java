import javax.swing.JOptionPane;

public class gradeAprovation {

    public static void main(String[] args){ 

        int notaAluno, percentualFalta;
        
        notaAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));
        percentualFalta = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de faltas de aluno: "));
        
        if 	((notaAluno >=70 ) && (percentualFalta <=25)){
            System.out.println("Parabéns, você passou!");

        } else{
            
            if ((notaAluno >=40) && (percentualFalta <=25)) {
                System.out.println("Você tem a oportunidade de fazer uma prova alternativa!");
            }
            else {
                System.out.println("Infelizmente, você não passou!");
            }
        }
    }
}
