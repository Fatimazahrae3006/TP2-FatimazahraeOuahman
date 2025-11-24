# TP2 DevOps - Application Android

## 📱 Description
Cette application Android a été développée dans le cadre du TP2 de DevOps par **Fatimazahrae Ouahman**. Elle utilise Kotlin et Jetpack Compose.

## 🛠️ Technologies utilisées
- **Langage** : Kotlin
- **Framework UI** : Jetpack Compose
- **Build Tool** : Gradle
- **IDE** : Android Studio

## 🏗️ Architecture
Le projet suit l'architecture MVVM (Model-View-ViewModel) recommandée par Google pour les applications Android.

## 📦 Installation

### Prérequis
- Android Studio Arctic Fox ou plus récent
- JDK 17
- Android SDK API 36 ou supérieur

### Étapes d'installation
1. Clonez le dépôt :
```bash
   git clone https://github.com/Fatimazahrae3006/TP2-FatimazahraeOuahman.git
```

2. Ouvrez le projet dans Android Studio

3. Synchronisez le projet avec Gradle

4. Lancez l'application sur un émulateur ou appareil physique

## 🔧 Build et Tests

### Build local
```bash
./gradlew build
```

### Lancer les tests
```bash
./gradlew test
```

### Générer l'APK
```bash
./gradlew assembleDebug
```

## 🚀 CI/CD avec GitHub Actions

Ce projet utilise GitHub Actions pour l'intégration continue. Le workflow automatise :
- ✅ Compilation du code
- ✅ Exécution des tests
- ✅ Génération de l'APK
- ✅ Upload des artefacts

Le workflow se déclenche automatiquement sur :
- Push sur la branche main/master
- Pull requests vers main/master

## 📸 Captures d'écran

### Écran principal
![Écran principal](screenshots/main_screen.png)

### Fonctionnalité 1
![Fonctionnalité 1](screenshots/feature1.png)

### Fonctionnalité 2
![Fonctionnalité 2](screenshots/feature2.png)

## 🎯 Fonctionnalités
- [x] Interface utilisateur moderne avec Jetpack Compose
- [x] Navigation entre écrans
- [x] Gestion d'état réactive
- [x] Tests unitaires
- [x] Integration continue avec GitHub Actions

## 📈 Statut du Build
![Build Status](https://github.com/Fatimazahrae3006/TP2-FatimazahraeOuahman/workflows/Android%20CI/badge.svg)

## 👨‍💻 Auteur
**Fatimazahrae Ouahman** - TP2 DevOps
**Email** : FATIMAZAHRAE.OUAHMAN@emsi-edu.ma

## 📄 Licence
Ce projet est sous licence MIT - voir le fichier [LICENSE](LICENSE) pour plus de détails.
## 🆕 Nouvelles fonctionnalités (v2.0)

### Améliorations récentes
- ✅ Correction des erreurs de compilation
- ✅ Optimisation du workflow CI/CD
- ✅ Amélioration de la documentation
- ✅ Suppression des tests défaillants

### Fonctionnalités à venir
- 🔄 Interface utilisateur améliorée
- 🔄 Tests unitaires robustes
- 🔄 Déploiement automatique
- 🔄 Monitoring et logs

### Historique des versions
- **v2.0** : Projet stable avec CI/CD fonctionnel
- **v1.0** : Version initiale du projet