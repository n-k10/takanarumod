# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 00: 環境構築

このステップでは、Forge Modの開発環境をセットアップします。
Forge MDKのテンプレートをベースに、Modの基本構造を理解しましょう。

### 事前に必要なもの
- **Java 17（JDK）** — [Adoptium](https://adoptium.net/) からダウンロード
- **IntelliJ IDEA Community Edition**（無料） — [JetBrains](https://www.jetbrains.com/idea/download/) からダウンロード
- **Forge MDK 1.20.1** — [Minecraft Forge](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.20.1.html) からダウンロード
- **Minecraft 1.20.1**

### セットアップ手順
1. このリポジトリをクローンする
2. IDEでプロジェクトを開く（Gradleプロジェクトとしてインポート）
3. Gradleの同期が完了するまで待つ
4. `gradlew runClient` でMinecraftが起動することを確認する

### プロジェクト構造
```
src/main/java/           ← Javaのソースコード
  com/example/examplemod/
    TakanaruMod.java     ← Modのメインクラス（@Mod アノテーション）
    Config.java          ← 設定ファイル用クラス

src/main/resources/      ← リソースファイル（テクスチャ、モデル、翻訳など）
  META-INF/mods.toml     ← Modの情報（名前、バージョン、依存関係）
  pack.mcmeta            ← リソースパック情報

build.gradle             ← ビルド設定
gradle.properties        ← Mod ID、バージョンなどの設定値
```

### 重要なファイル
| ファイル | 説明 |
|---------|------|
| [`src/main/java/com/example/examplemod/TakanaruMod.java`](src/main/java/com/example/examplemod/TakanaruMod.java) | Modのエントリーポイント |
| [`src/main/java/com/example/examplemod/Config.java`](src/main/java/com/example/examplemod/Config.java) | Mod設定の定義 |
| [`src/main/resources/META-INF/mods.toml`](src/main/resources/META-INF/mods.toml) | Modのメタデータ |
| [`gradle.properties`](gradle.properties) | Mod ID・バージョン・Forgeバージョンなどの設定 |

### テクスチャ
このステップでは新しいテクスチャは不要です。
