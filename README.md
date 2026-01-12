# Tasca 03 - Java Collections Framework

**Descripció**: Aquest projecte conté una col·lecció d'exercicis pràctics enfocats a l'aprenentatge i domini de les **Java Collections**. L'objectiu és comprendre les diferències entre `ArrayList` i `HashSet`, l'ús d'iteradors (`Iterator`, `ListIterator`) i la implementació de lògica de comparació i ordenació d'objectes personalitzats (`equals`, `hashCode`, `Comparable`).

## 📌 Enunciat del exercici

El projecte es divideix en dos nivells de dificultat:

### Nivell 1
* **Exercici 1 (Month List):** Crear una classe `Month`, inserir els 12 mesos en un `ArrayList` (deixant agost per al final per inserir-lo per índex), convertir la llista a un `HashSet` per comprovar que no permet duplicats i recórrer la llista amb for-each i iteradors.
* **Exercici 2 (Reverse List):** Crear i omplir una llista d'enters (`List<Integer>`). Utilitzar un `ListIterator` per llegir els elements des del final cap al principi i inserir-los en una segona llista en ordre invers.

### Nivell 2
* **Exercici 1 (Restaurant Uniqueness):** Crear una classe `Restaurant` (nom i puntuació). Implementar `equals()` i `hashCode()` perquè un `HashSet` no permeti dos restaurants amb el mateix nom i la mateixa puntuació (duplicats exactes), però sí mateix nom amb diferent puntuació.
* **Exercici 2 (Restaurant Sorting):** Ampliar l'exercici anterior per ordenar la llista de restaurants. L'ordre ha de ser:
    1.  Alfabètic per nom (Ascendent).
    2.  Si el nom coincideix, per puntuació (Descendent: de major a menor).
	En aquest exercici s'ha fet us del comparable, ja que directament afegint el metode compareTo(), el comparable ordenará automaticament per ordre alfabetic la llista nova creada i també afegint codi s'ordenara per ordre descendent la llista. Es mes útil en aquest cas utilitzar Comparable ja que no volem ordenar d'una forma específica la llista, llavors seria mes util utilitzar el Comparator.
## ✨ Funcionalitats

El projecte demostra les següents capacitats tècniques:

* **Gestió de Llistes (`ArrayList`):** Inserció ordenada i per índex.
* **Gestió de Conjunts (`HashSet`):** Filtrat automàtic de duplicats basat en atributs d'objecte.
* **Iteració Avançada:** Ús de `ListIterator` per a recorreguts bidireccionals (inversos).
* **Comparació d'Objectes:** Implementació correcta de `equals` i `hashCode` per garantir la integritat de les dades.
* **Ordenació Personalitzada (`Comparable`):** Implementació de `compareTo` per definir l'ordre natural dels objectes amb criteris múltiples (Nom i Puntuació).

## 🛠 Tecnologies
- **Llenguatge:** Java (JDK 8+)
- **Biblioteques:** Java Standard Library (`java.util.*`)
- **IDE Recomanat:** IntelliJ IDEA / Eclipse

## 🚀 Instal·lació i Execució

1. **Clonar el repositori:**
   ```bash
   git clone [URL_DEL_TEU_REPOSITORI]
