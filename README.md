**Nom :** Lorenzo De Macedo

**Groupe :** A1/Equipe 5

**Année :** 2022/2023

**IUT Le Havre - Cours GIT**

### Compte-rendu TP3 Introduction GIT afin de travailler en équipe

Après avoir effectuer notre tp2 nous passons maintenant au tp3

## Inviter des collaborateurs dans notre depot

Tout d'abord, un membre de votre équipe, sera chargé de créer un dépôt sur son compte GitHub appelé "tp3" avec les mêmes paramètres que ceux utilisés pour le "tp2". Une fois le dépôt créé, vous devrez accéder aux paramètres en cliquant sur **Settings**, puis sur **Manage Access**, et enfin sur **Invite a collaborator**.

Ensuite, vous pouvez ajouter votre collaborateur grace a son nom GitHub.


## Les branches et branches secondaires

Si nous voulons tester une fonctionnalités avant de l'intégré dans la branche principal afin d'eviter de l'ajouter definitivement, nous allons alors travailler sur une autre branche.

Avec la commande `git branch` vous pouvez verifier sur quelle branche vous vous situez.

Avec la commande `git checkout -b test`, vous pourrez crée et vous deplacer sur la branche test.
_L'option -b permet de dire à **checkout** que nous créons et nous déplacons sur la branche_

Pour se déplacer de branche en branche, vous avez juste à utiliser la commande `git checkout ...`
les trois petits point represntant le nom de votre branche ici test par exemple.

Note : Les branches secondaire ne sont pas visible par la branche principale par exemple

Si vous voulez suivre le développement depuis la branche princiaple sous forme de graphe, tappez la commande :
`git log --graph --oneline --all --decorate --topo-order`

Grace aux exercice de se tp nous pouvond voir par exemple que si l'on effectues la commande `ls` dans la branche test on ne trouve pas le contenut de la branche main et inversement d'ou le point suivant la fusion de branche.


## Fusionner deux branches
Si vous voulez merger et donc fusionner deux branches, par exemple, main et test, aller tous dabord sur la branche main puis tapper la commande :
`git merge test` cela fusionnera sur la branche main la branche test mais cela peuc fonctionner dans les deux sens.

Vous pouvez voir maintenant avec la commande `ls` tous les fichiers de main et de test se trouve maintenant tous dans la branche main.