//Variaveis
let total = [];
var soma=[]
var recebeProva = []
var recebeGabarito = []
var alt = ["A","B","C","D"];

//Função gerar letras aleatorias
function gerarG() {
      var random = " "
      for (let i = 0; i < 10; i++) {
        var random = alt[Math.floor(Math.random()*alt.length)];
      }
      return random;
}

//Função para gerar Gabarito e Provas Aleatorias
  function gerarProva() {
    var alunoP = [];
    var gabarito = [];
    for (let i = 0; i < 1; i++) {
      gabarito.push(gerarG())
      for (let j = 0; j < 10; j++) {
        alunoP.push(gerarG());
      }
    }
    return alunoP
  }


//Gerar Gabarito
  recebeGabarito.push(gerarProva())
  console.table(recebeGabarito)  

//Gerar Provas 
  for (let i = 0; i < 100; i++) {
    recebeProva.push(gerarProva());  
  }
  console.table(recebeProva)

//Contador de acerto

  for (let i = 0; i < 100; i++) {
    soma = 0;
    for (let j = 0; j < 10; j++) {
      if(recebeProva[i][j]===recebeGabarito[0][j]){
          soma++
        }
      }
      console.log((i)+" aluno, Nota: "+ soma)
    }
 

  




      
    
      


    
    
  
  
    

  