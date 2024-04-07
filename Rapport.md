# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme :

## Exercices 1

Ici le patron de conception utilisé est le **Composite**. 
La classe `MobileObject` est un composant, tandis que la classe `Vehicle` est un composite.     

Etant donné que la classe `TagAlongBike` herite de la classe `Vehicle`, il n'est pas nécessaire de réécrire les méthodes `getVelocity()` et `getMass()` car elles sont déjà implémentées dans la classe `Vehicle`.

## Exercices 2

Le patron de conception utilisé pour parcourir les composants d'un véhicule dans la méthode `getVelocity()` est le patron de conception "Iterator".
Il permet de parcourir une collection d'objets sans exposer la structure interne de la collection.

Il permet donc de remplacer la structure de donnée utilisée pour stocker les composants d'un véhicule de `Set` à `List` sans modifier la réalisation de la méthode `getVelocity()`.

## Exercices 3

## Exercices 4

## Exercices 5

## Exercices 6

## Exercices 7

## Exercices 8


