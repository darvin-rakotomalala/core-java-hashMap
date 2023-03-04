## Java Core | HashMap

Dans ce repo, nous allons voir quelques exemples de HashMap.

Voici quelques points clés à noter sur `HashMaps` :

- Un HashMap ne peut pas contenir de clés en double.
- Java HashMap autorise les valeurs `null` et la clé `null`.
- HashMap est une collection non ordonnée. Il ne garantit aucun ordre spécifique des éléments.
- Java HashMap n'est pas thread-safe. Vous devez synchroniser explicitement les modifications simultanées sur le
  HashMap.

### Exemples
---

- Création HashMap
- Vérifier si un HashMap est vide | `isEmpty()`
- Trouver la taille d'un HashMap | `size()`
- Vérifier si une clé donnée existe dans un HashMap | `containsKey()`
- Vérifier si une valeur donnée existe dans un HashMap | `containsValue()`
- Obtenir la valeur associée à une clé donnée dans le HashMap | `get()`
- Modifier la valeur associée à une clé donnée dans le HashMap | `put()`
- Supprimer une clé d'un HashMap | supprimer (clé d'objet)
- Supprimer une clé d'un HashMap uniquement si elle est associée à une valeur donnée | supprimer (clé d'objet, valeur
  d'objet)
- Obtention de l'entrySet, du keySet et des valeurs d'un HashMap
- Itération sur un HashMap en utilisant Java 8 `forEach` et l'expression lambda
- Itérer sur l'entrySet de HashMap en utilisant `iterator()`
- Itération sur l'entrySet de HashMap à l'aide de Java 8 `forEach` et de l'expression lambda
- Itérer sur l'entrySet de HashMap en utilisant une simple boucle for-each
- Itération sur le keySet de HashMap
- Java HashMap avec des objets définis par l'utilisateur