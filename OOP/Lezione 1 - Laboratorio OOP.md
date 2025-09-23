### Regole corso
- Usare il forum per chiarire dubbi tecnici
- LLM vietati
- Esercizi da eseguire singolarmente in autonomia
### Come funziona il JDK
La nostra versione del Java è la Java Standard Edition, per sviluppo di applicazioni di uso generale. Ma ce ne sono altre:
- Micro Edition: Per dispositivi a basse prestazioni
- Enterprise Edtion: Per sviluppi di software a larga scala
- Card: per lettori di smart card e dispositivi con memoria limitata
Java può o meno includere gli strumenti di sviluppo (SDK): se li possiede si parla di JDK (Development Kit), altrimenti JRE (Runtime Enviroment).

Le distribuzioni di Java cambiano in base alle implementazioni che possiedono, che cambiano in base alle prestazioni dei dispositivi su cui i programmi devono funzionare.
Le implementazioni sono a loro volta disribuite da diverse vendor, sulla base di alcune leggere modifiche apportate al linguaggio.

Noi utilizzeremo JDK 21, ossia Java con Virtual Machine e relative librerie e strumenti di sviluppo.
Nonostante sia uscito JDK 25, usiamo comunque JDK 21 per evitare eventuali "problemi di gioventù"; tuttavia programmi realizzati in Java sono retrocompatibili, ossia versioni nuove di Java possono runnare tali programmi. 

Il compiler di Java, `javac`, compila il programma, **traducendolo** in bytecode; questo linguaggio, simile all'Assembly, viene **interpetato** dalla JVM, eseguendo il programma.

Utilizzeremo il terminale per compilare e runnare i vari programmi. Utilizzare gestori di file system (come Esplora Risorse di Windows), possono nascondere delle informazioni, cosa che il terminale non fa. 

### Come compilare e runnare in Java
Compilare un file singolo di nome `namefile`
```bash
javac <namefile>.java
```
Compilare più file .java alla volta
```bash
java *.java
```
Per runnare un programma:
```bash
java <namefile>
```
`jshell` è una shell che interpreta istruzioni Java come se fosse una bash.
