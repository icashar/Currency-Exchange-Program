[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=9655494)
# Examen - partie 1 : tâche authentique

Ce répertoire est celui pour votre projet final en programmation.

SVP placer ou compléter tous fichiers liés à votre projet dans ce répertoire incluant :

* fichiers texte de planification (`pseudocode.txt` et `ets.txt`)
* code source (fichier .java)
* bytecode (fichier .class)

## Objectif

Écrire un programme interactif modulaire en Java. Notamment, ce type de programme doit utiliser :

* les entrées et sorties à la console
* la sélection
* l'itération
* les méthodes
* possiblement les tableaux

Le programme doit continuer jusqu'à ce que l'utilisateur choisit de quitter (via un menu d'acceuil, par exemple).

## Livrables

Pour compléter ce projet, les élèves doivent rendre :

- [ ] Le **pseudocode** pour la logique globale de l'application, complété dans le fichier `pseudocode.txt`
- [ ] Une **analyse entrée/traitement/sortie** pour une des méthodes du programme (autre que la méthode main), complété dans le fichier `ets.txt`
- [ ] Un **programme principal** - une classe dans un fichier .java - qui fait quelque chose d'intéressant
    * inclut la méthode main
    * le nom du fichier représente ce que le programme fait ou a un nom générique comme Jeu.java ou App.java
    * fournit une interface avec l'utilisateur (invites de commandes, affichage de résultats) en français
    * implémente la logique du programme selon les principes d'un programme modulaire, notamment : "DRY : Don't repeat yourself" via des variables appropriés, l'itération, les méthodes (et, optionnellement, les tableaux)
- [ ] Le **bytecode** - fichier .class - du projet, obtenu en compilant le programme avec la commande `javac`

## Critères d'évaluation

Compétence | Critère | Note et commentaire
-- | -- | --
HP | <p>Algorithmes logiques et bien documentés</p><p>Code DRY*</p> | 
CO | <p>Clair et facile à suivre (interface utilisateur, identifiants, style/indentation)</p><p>En-tête javadoc dans le fichier de code source</p> | 
MA | <p>Travail complet et fait selon les consignes</p><p>Le programme se lance à partir de votre fichier .class sans erreurs</p> | 

>*DRY = "don't repeat yourself". C'est un principe qui guide le choix des variables et le choix d'utiliser des tableaux, de l'itération et/ou des méthodes afin de ne pas copier-coller du code identique (ou des valeurs littérales identiques) à différents endroits dans le programme.

## Notes

* Du point de vue technique, il faut minimalement utiliser l'itération ou des méthodes récursives (qui s'appellent elles-mêmes) pour obtenir l'effet d'un programme "qui se répète à moins que l'utilisateur décide de quitter".
* Le projet doit être original et représenter une idée que vous avez pour une vraie application, même si le projet ne réalise pas entièrement cette idée. **Vous ne serez pas pénalisé pour une idée partiellement implémentée** si le travail rendu est tout de même fonctionnel et atteint les critères techniques minimales.
* Ce qui est essentiel est l'explication de la logique que vous avez réussi à implémenter, soit :
    * les commentaires de ligne pour les sélections, les itérations et les méthodes dans votre code
    * votre pseudocode qui explique votre idée plus complètement
    * votre analyse entrée/traitement/sortie qui démontre votre compréhension du fonctionnement logique d'une méthode
* Considérant les deux derniers points en lien avec votre note pour ce travail : **un projet final moche mais bien expliqué est un meilleur choix stratégique qu'un projet très fonctionnel/impressionant adapté (de sources non citées) mais mal expliqué**.

