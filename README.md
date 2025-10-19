# ATPS1-FIla-Pilha-Grupo-5

## 🧑‍🎓 ALUNOS:
<br>

 **Alisson Daledone**
 <br>
 **Geandro Marques**
 <br>
 **Juliano Teles**

 ## OBSERVAÇÕES PERTINENTES

 **Alguns arquivos no projeto possuem a mesma estrututura porém com nomes de atributos diferentes, por isso não estão na explicação. Arquivos estes o 'ElementoFila.java' e o 'NoFila.java' que possuem a mesma estrutura do 'Elemento.java' e do 'No.java'. Por isso não foi visto a necessidade de explica-los**

 ## Explicação do código

 # Elemento.java

 Essa classe possui 3 atributos: 'id', 'descricao' e 'data_hora'. possui também getters e setters para o acesso desses atributos. Para montar um elemento é necessário preencher os 3 campos.<br>
 <img width="824" height="709" alt="image" src="https://github.com/user-attachments/assets/5bca2f24-85a0-47d6-a752-b98fd9655255" />


 # No.java

 Essa classe possui dois atributos, um do tipo Elemento, contendo um elemento qualquer e um do tipo No contendo uma referencia para o proximo nó. Possui getters e setters também para acesso, e seu construtor precisa passar o elemento como argumento e inicializa com o próximo nó com valor nulo.  

 <img width="523" height="503" alt="image" src="https://github.com/user-attachments/assets/54826b20-02c7-4b22-9e1c-e630d8b37afe" /><br>
 <br>

 # Fila.java

 Essa classe possui 3 atributos, dois do tipo 'No', um para o inicio da fila (cabeça) e outro para o fim da fila (cauda). E um atributo do tipo int para o tamanho da fila, ou seja a quantidade de elementos nela. Seu construtor inicializa com a cabeça e a cauda tendo valores nulos, e o tamanho 0. Isso porque a fila começa vazia.
<br>
<br>
<img width="236" height="78" alt="image" src="https://github.com/user-attachments/assets/76dda297-7f88-482b-8c49-8800b682628c" /><br>
Função para verificar se lista encadeada está vazia, ela retorna um valor boolean dependendo se o valor do tamanho é ou não 0.<br>
<br>
<img width="196" height="69" alt="image" src="https://github.com/user-attachments/assets/f93d13f4-5913-4b2a-86fa-7ecc80e36433" /><br>
Getter do Tamanho.<br>
<br>
<img width="309" height="81" alt="image" src="https://github.com/user-attachments/assets/0558846e-9369-404d-925a-ef03a7775568" /><br>
Função que retorna o primeiro elemento da fila.<br>
<br>
<img width="342" height="230" alt="image" src="https://github.com/user-attachments/assets/c8e71015-a1ac-4dac-9638-8fb9a14b15c5" /><br>
Função que insere um elemento recebido como parametro, ele faz isso criando inicialmente um novo nó com o elemento desejado, após isso ele verifica se esse elemento a ser inserido vai ser o primeiro, verificando se a fila está vazia. Se esse for o caso ele insere o elemento como cabeça, caso o contrário ele insere como o próximo elemento da fila. E atualiza a fila para o novo elemento inserido ser a cauda e incrementar o tamanho.<br>
<br>
<img width="315" height="176" alt="image" src="https://github.com/user-attachments/assets/06d8a65f-3f18-4902-a583-6f6391443ded" /><br>
Função que remove o primeiro elemento da fila, ele cria uma váriavel temporaria para armazenar o primeiro nó, depois ele passa a cabeça para o proximo nó e após isso ele corta o nó antigo. Após isso o tamanho é decrementado.<br>
<br>
# Pilha.java

Essa classe possui 1 atributo só, que é o topo da pilha, o construtor inicializa uma pilha com o valor do topo nulo, pois ela está vazia.<br>
<br>
<img width="226" height="71" alt="image" src="https://github.com/user-attachments/assets/5cc35137-aa7d-4ed9-997d-d30d06cd66dc" /><br>
Função que verifica se a pilha tá vazia, se o topo estiver como nulo, retorna True significando que a pilha está vazia, caso o contrário retorna False.<br>
<br>
<img width="366" height="189" alt="image" src="https://github.com/user-attachments/assets/49894388-fb4a-467a-8b6a-b15a50082224" /><br>
Função que insere um elemento no topo da pilha, inicialmente ele cria um nó com o valor que foi inserido, depois ele verifica se a pilha está vazia, se estiver ele atribui o no ao topo, caso o contrário ele seta o novo no para o antigo topo e esse novo no começa a ser o novo topo.<br>
<br>
<img width="478" height="156" alt="image" src="https://github.com/user-attachments/assets/0a9b6625-f534-4082-80ce-6be0302c2220" /><br>
Função que remove o elemento no topo, ele verifica se estiver vazia, caso esteja ele imprime que o histórico está vazio para o usuario. agora se não estiver ele aponta o topo para o próximo nó, desconectando o topo antigo.<br>
<br>
<img width="632" height="275" alt="image" src="https://github.com/user-attachments/assets/42287327-6197-4c61-b3e2-621e4fe01772" /><br>
Função que verifica e imprimi o histórico, primeiro ele cria um nó auxiliar com o topo, depois ele percorre toda a pilha e sai imprimindo os valores de cada elemento.<br>









 





 
