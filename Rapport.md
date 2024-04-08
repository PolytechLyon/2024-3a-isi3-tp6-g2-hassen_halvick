# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : 
HALVICK Thomas
GHAZEL Hassen

## Exercices 1

Ici le patron de conception utilisé est le **Composite**. 
La classe `MobileObject` est un composant, tandis que la classe `Vehicle` est un composite.     

Etant donné que la classe `TagAlongBike` herite de la classe `Vehicle`, il n'est pas nécessaire de réécrire les méthodes `getVelocity()` et `getMass()` car elles sont déjà implémentées dans la classe `Vehicle`.

## Exercices 2

Le patron de conception utilisé pour parcourir les composants d'un véhicule dans la méthode `getVelocity()` est le patron de conception "Iterator".
Il permet de parcourir une collection d'objets sans exposer la structure interne de la collection.

Il permet donc de remplacer la structure de donnée utilisée pour stocker les composants d'un véhicule de `Set` à `List` sans modifier la réalisation de la méthode `getVelocity()`.

## Exercices 3

Pour assurer qu'il n'y a qu'une seule instance de la classe `Clock` dans l'application, on utilise le patron de conception **Singleton**.
Pour cela on doit :
- Déclarer le constructeur de la classe `Clock` en privé.
- Déclarer une variable statique de la classe `Clock` qui contiendra l'instance unique de la classe.
- Déclarer une méthode statique qui permettra de récupérer l'instance unique de la classe `Clock` et de la créer si elle n'existe pas.

## Exercices 4

Les classes `Bike` et `Wheel` n'appartiennent pas au même paquetage. Il y a une dependance cyclique entre les deux paquetages.
`Wheel` (paquetage 1) depend de `Bike` (paquetage 2) et `Bike` (paquetage 2) depend de `Vehicle` (paquetage 1).
C'est un anti-patron de conception.

Il y a une abstraction de `Bike` en `Vehicle` dans le paquetage 1 qui permet de résoudre ce problème.   

## Exercices 5

## Exercices 6

## Exercices 7

## Exercices 8

## Exercices 9

