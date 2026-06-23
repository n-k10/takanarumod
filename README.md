# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 01: アイテムを追加しよう

このステップでは、オリジナルのアイテム（銀・銀の原石）をゲームに追加します。

### やること
- `ModItems.java` を作成してアイテムを登録する
- `ModCreativeModTabs.java` を作成してクリエイティブタブを追加する
- `TakanaruMod.java` にアイテムとタブの登録処理を追加する
- アイテムモデルJSON（`silver.json`, `raw_silver.json`）を追加する
- 英語翻訳ファイル（`en_us.json`）を追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/item/ModItems.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java` | 編集 |
| `src/main/resources/assets/takanarumod/models/item/silver.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/raw_silver.json` | 新規 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 新規 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（16x16ピクセルのPNG）:
- `src/main/resources/assets/takanarumod/textures/item/silver.png`
- `src/main/resources/assets/takanarumod/textures/item/raw_silver.png`
