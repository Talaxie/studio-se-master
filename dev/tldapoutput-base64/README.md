# tLDAPOutput : décodage Base64 avec les API publiques Java

Correction commune à toutes les éditions qui embarquent le composant `tLDAPOutput`.
Les modèles sont dans `tdi-studio-se/main/plugins/org.talend.designer.components.localprovider/components/tLDAPOutput`.
Aucun job client ni script de conversion n'est modifié.

## Correctif

Les six méthodes de `CheckBase64_<cid>` conservent leurs noms, paramètres et opérations LDAP.
Deux méthodes privées utilisent `java.util.Base64`, sans dépendance supplémentaire ni option d'ouverture de module.
Les anciennes clauses `throws Base64DecodingException` sont supprimées.
Avec `isBase64=false`, la valeur d'origine est transmise directement, y compris son type et l'identité des tableaux.
Avec `isBase64=true`, les attributs reçoivent des octets décodés. Les tableaux encodés ne passent jamais par une chaîne ou un encodage par défaut.

Le début du `try` de `tLDAPOutput_main.javajet` englobe désormais aussi la préparation des attributs : elle se trouvait auparavant en dehors du traitement d'erreur pour INSERT, ADD et INSERT_UPDATA.
Les erreurs du nouveau décodeur sont des `IllegalArgumentException`, capturées par le `catch(java.lang.Exception e)` existant.
Le message global, l'arrêt si DIE_ON_ERROR, le rejet éventuel, le compteur de rejets et la suppression de la sortie normale suivent ce même circuit.
Une erreur n'est jamais remplacée par une valeur vide et aucune écriture LDAP n'est effectuée pour la ligne invalide.
Le modèle `end` ne contient aucun import ou traitement d'exception à supprimer et reste inchangé.

## Compatibilité historique

Le programme `LegacyProbe.java` a été exécuté avec le décodeur réellement fourni par le JRE Oracle 8u491 local.
Le code historique est aussi consultable dans [OpenJDK 8u](https://github.com/openjdk/jdk8u/blob/master/jdk/src/share/classes/com/sun/org/apache/xml/internal/security/utils/Base64.java).

| Entrée, décodage activé | Comportement conservé |
| --- | --- |
| `String null` | Valeur LDAP nulle |
| `byte[] null` | Tableau d'octets vide ; différence historique entre les deux surcharges |
| Chaîne ou tableau vide | Tableau d'octets vide |
| Espace ASCII, tabulation, CR, LF | Ignorés, même au milieu du padding |
| Uniquement ces quatre espaces | Tableau d'octets vide |
| `TQ==`, `TWE=`, `TWFu` | Respectivement `M`, `Ma`, `Man` en octets |
| `TQ`, `TWE` | Rejet : padding obligatoire pour le groupe final incomplet |
| Padding mal placé, excessif, tronqué ou suivi de données | Rejet |
| `TR==`, `TWF=` | Rejet des bits inutilisés non nuls |
| `$`, `_`, form feed, tabulation verticale, espace insécable | Rejet |

Le décodeur public strict est précédé d'une suppression limitée à ces quatre espaces et d'un contrôle de longueur multiple de quatre.
La ré-encodification du résultat contrôle les bits de padding : l'API Java seule accepterait certaines représentations rejetées par l'ancien décodeur.
Le décodeur MIME n'est pas utilisé.

Différences explicites :

- Le type de l'exception devient `IllegalArgumentException`, et ses messages diffèrent. Le circuit d'erreur du composant est préservé.
- L'ancienne surcharge String pouvait tronquer les caractères Unicode sur huit bits : `\u0141AAA` était ainsi accepté comme `AAAA`. Le nouveau code rejette ces caractères hors ASCII. Il ne conserve pas cette acceptation accidentelle de données invalides.
- Pour certains octets hors ASCII, l'ancien décodeur pouvait produire une erreur d'index de tableau ; le nouveau décodeur produit une erreur de donnée Base64.
- L'ancien décodeur compactait les espaces dans le tableau encodé fourni. Le nouveau code travaille sur une copie et ne modifie pas l'entrée.

La recherche des deux classes internes et de `sun.misc.BASE64Decoder` / `BASE64Encoder` dans les fichiers Java et JET des cinq arbres de production n'a trouvé aucune autre occurrence après correction.
Il n'y a donc pas d'autre composant à modifier dans ce périmètre de recherche.

## Tests reproductibles

Prérequis : Python 3, JDK 21 pour les émetteurs Studio, JDK 17 et/ou 21 pour les mini-jobs, une distribution Talaxie existante utilisée **en lecture seule** comme source des bibliothèques de test.

Depuis la racine du monodépôt :

```sh
python3 dev/tldapoutput-base64/run_tests.py \
  --studio /chemin/vers/distribution-talaxie \
  --java-home /chemin/vers/jdk-21 \
  --job-java-home /chemin/vers/jdk-17 \
  --output /tmp/tldapoutput-jdk17
```

Relancer avec `--job-java-home /chemin/vers/jdk-21` et un autre répertoire de sortie pour vérifier le JDK du Studio.
Le script ne change ni la distribution, ni son workspace, ni ses caches.
Pour reproduire le témoin historique, compiler `LegacyProbe.java` avec `javac --release 8`, puis l'exécuter avec `java` d'un JRE/JDK 8. Ce témoin est facultatif ; les tests du correctif n'utilisent pas les classes internes.

Le script compile les trois vrais modèles JET begin/main/end avec le compilateur EMF de Studio, puis appelle leurs émetteurs avec un modèle minimal de composant.
Il compile et exécute 49 programmes de validation avec `--release 17` :

- Une fixture appelle les six méthodes du helper, décodage activé et désactivé : valeurs nulles/vides, espaces autorisés/interdits, padding valide/absent/incorrect, caractères invalides, identité des valeurs non décodées et restitution de tous les octets 0 à 255.
- 48 mini-jobs couvrent INSERT, ADD, UPDATA et INSERT_UPDATA, les chaînes avec valeurs multiples et les tableaux, les deux états du décodage et trois politiques d'erreur (arrêt, rejet, message seul).
- Les mini-jobs contrôlent le contenu LDAP, les compteurs, la sortie normale, le contenu du rejet, le message global et l'absence d'écriture pour une erreur de décodage.
- Le contexte LDAP est remplacé à la frontière par un contexte en mémoire ; aucun serveur LDAP/Active Directory n'est utilisé.
- Le Java émis est contrôlé pour l'absence des anciennes références internes et s'exécute aussi avec un encodage par défaut Windows-1252.

Ces fixtures exercent la génération réelle du composant ; elles ne constituent pas un export complet depuis l'interface du Studio. La confirmation du job OGF reste à effectuer après déploiement par l'utilisateur.

## Reconstruction et mise à jour

La correction est livrée dans le monodépôt principal `Talaxie/studio-se-master`, sur une branche issue de `develop`.
Elle bénéficie aux futures distributions DI, ESB, BD ou DQ qui incluent ce composant commun ; les installations et anciennes branches de maintenance ne sont pas automatiquement mises à jour.

Pour reconstruire les produits DI et ESB avec JDK 21 :

```sh
mvn -B -f studio-se-master/pom.xml \
  -Dtos.di=true -Dtos.esb=true \
  -DskipTests -Dmaven.test.skip=true \
  clean install
```

Les tests ciblés doivent être exécutés séparément comme indiqué ci-dessus. Les autres produits utilisent les options de compilation habituelles du dépôt.
Les produits reconstruits se trouvent dans `studio-se-master/build/talend.studio.tos.<edition>.product/target/products/`.
Vérifier dans chaque produit que le plugin `org.talend.designer.components.localprovider_*` contient les deux nouveaux modèles.

Le remplacement de `/Applications/Talaxie-8.9-ogf` sera effectué ultérieurement par l'utilisateur, après reconstruction du Studio. Aucun remplacement manuel de modèle dans cette installation n'est requis pour la livraison.
Fermer complètement le Studio avant cette copie, sauvegarder l'installation et préserver ses workspaces, configurations et composants personnalisés suivant la procédure de déploiement habituelle.
Un redémarrage et une régénération des jobs sont nécessaires ; les fichiers Java et exports déjà générés ne changent pas automatiquement.

Au démarrage, le générateur compare le CRC des modèles au cache `.JETEmitters/JetPersistenceJAVA` et doit reconstruire les émetteurs modifiés.
Une suppression générale des caches n'est donc normalement pas nécessaire. Si le Java régénéré contient encore l'ancien décodeur, fermer le Studio puis déplacer `.JETEmitters/JetPersistenceJAVA` vers une sauvegarde hors de `.JETEmitters` pour forcer sa reconstruction ; ne jamais le faire pendant que le Studio fonctionne.
L'option Eclipse `-clean` concerne le cache des bundles et ne remplace pas la régénération JET.

Après copie et redémarrage, régénérer et compiler avec une cible Java 17 le job :

```text
/Applications/Talaxie-8.9-ogf/workspace/TESTCREMA/process/TRAITEMENT/AD/JA_AD_ACTIVITE_HOME_MANAGER_0.1.item
```

Contrôler l'absence des deux classes internes dans le Java produit. Ne pas exécuter les mises à jour Active Directory pour cette validation.

## Résultats locaux du 4 novembre 2026

- Départ : `develop` du monodépôt, commit `8190ba8b8437bba025be047b36c73795272168ab`.
- JDK 17.0.11 : 49 programmes générés compilés pour Java 17 et exécutés avec succès.
- JDK 21.0.12.1 : mêmes 49 programmes compilés pour Java 17 et exécutés avec succès ; émetteurs JET compilés avec ce JDK.
- Six méthodes : 194 assertions comptabilisées, plus les contrôles d'identité et d'erreur, avec décodage activé/désactivé.
- Témoin historique exécuté avec le JRE Oracle 8u491 ; résultats consignés séparément.
- Le plugin Maven produit a été ouvert et ses deux modèles comparés octet pour octet aux sources corrigées.
- Aucun test n'a exécuté de mise à jour LDAP réelle. Le job OGF n'a pas été modifié.

- Reconstruction complète : **BUILD SUCCESS**, 385 modules en 7 min 59 s, JDK 21, `clean install`, produits DI et ESB pour macOS Cocoa ARM64.
- Options : `-Dtos.di=true -Dtos.esb=true -DskipTests -Dmaven.test.skip=true -DforceContextQualifier=20261104_1305_ldap_base64` ; Maven utilisé hors ligne avec son cache local. Les tests ciblés ont été exécutés séparément.
- Pour cette construction locale, la liste des environnements cibles a été limitée temporairement à macOS Cocoa aarch64, puis restaurée octet pour octet. Aucune restriction de plateforme n'est incluse dans le correctif.
- Les deux modèles sont identiques aux sources dans le plugin Maven, les produits DI/ESB décompressés **et leurs deux archives**.
- Les 49 programmes générés ont également été recompilés et exécutés avec succès pour Java 17 en utilisant les bibliothèques du nouveau Studio DI.
- Archives produites : `TOS_DI-20261104_1305-V8.9.0SNAPSHOT-macosx.cocoa.aarch64.tar.gz` et `TOS_ESB-20261104_1305-V8.9.0SNAPSHOT-macosx.cocoa.aarch64.tar.gz`, dans les répertoires `target/products` indiqués ci-dessus.
- L'installation `/Applications/Talaxie-8.9-ogf` conserve ses modèles d'origine après restauration de la copie initiale ; aucun correctif n'y est installé. Le déploiement des nouveaux produits reste à effectuer par l'utilisateur.
