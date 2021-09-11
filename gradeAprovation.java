import javax.swing.JOptionPane;

public class gradeAprovation {

    public static void main(String[] args){ 

        int notaAluno, percentualFalta;
        
        notaAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));
        percentualFalta = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de faltas de aluno: "));
        
        if 	((notaAluno >=70 ) && (percentualFalta <=25)){
            System.out.println("Passou");

        } else{
            
            if ((notaAluno >=40) && (percentualFalta <=25)) {
                System.out.println("Prova Alternativa");
            }
            else {
                System.out.println("Não passou");
            }
        }
    }
}
