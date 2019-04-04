/*
9ª Questão: Faça um programa para criar e preencher um vetor de 10 números reais.  
O programa deve percorrer o vetor e determinar qual a maior diferença entre dois 
elementos consecutivos.
 */
package lista1;

public class lista1_q9 {
    public static void main(String[] args) {
        double []vet = new double [10];
        double dif=0, maior=0,index_par=0,index_impar=0;
        preencheVetor(vet);
        
        for(int i = 0; i<vet.length; i++){
            if(i % 2 == 0 && (i+1) % 2 != 0){
                dif = Math.abs(vet[i] - vet[i+1]);
                System.out.printf("Dif[%d-%d]:%.2f\n",i,(i+1),dif);
                if (dif > maior){
                maior = dif;
                index_par = i;
                index_impar = i+1;
                }
            }
        }
        System.out.printf("Maior diferença[%.0f-%.0f]: %.2f\n",index_par
                ,index_impar,maior);
        
        showVetores(vet);
        
    }
    public static void showVetores(double[] v){
        System.out.print("vetR: {");
        for (int i = 0; i < v.length; i++) {
            System.out.printf(", %.2f",v[i]);
        }
        System.out.println("}");
    }
    
    public static void preencheVetor(double[] x){
        for (int i = 0; i < x.length; i++) {
             x[i]= (Math.random() * 10);    
        }
    }
}
