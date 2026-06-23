# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 02: ブロックを追加しよう

このステップでは、銀ブロックと銀鉱石をゲームに追加します。
ブロックはアイテムと違い、ワールドに置くことができます。

### やること
- `ModBlocks.java` を作成してブロックを登録する
- `TakanaruMod.java` に `ModBlocks.register()` を追加する
- クリエイティブタブにブロックを追加する
- ブロックステート・ブロックモデル・アイテムモデルのJSONを追加する
- 翻訳ファイルにブロック名を追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/block/ModBlocks.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java` | 編集 |
| `src/main/resources/assets/takanarumod/blockstates/silver_block.json` | 新規 |
| `src/main/resources/assets/takanarumod/blockstates/silver_ore.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/block/silver_block.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/block/silver_ore.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_block.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_ore.json` | 新規 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（16x16ピクセルのPNG）:
- `src/main/resources/assets/takanarumod/textures/block/silver_block.png`
- `src/main/resources/assets/takanarumod/textures/block/silver_ore.png`
