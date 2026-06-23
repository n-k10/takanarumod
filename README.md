# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 17: 花ブロックを追加しよう

このステップでは、カスタム花ブロック「銀の花」を追加します。
植木鉢に入れることもでき、怪しいシチューに入れると幸運効果がつきます。

### やること
- `ModBlocks.java` に `FlowerBlock` と `FlowerPotBlock` を登録する
- `TakanaruMod.java` の `commonSetup` で植木鉢に花を登録する
- クライアントで `RenderType.cutout()` を設定する（花は透過表示が必要）
- クリエイティブタブに追加する
- ブロックステート・ブロックモデル・アイテムモデル・ルートテーブル・翻訳を追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/block/ModBlocks.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java` | 編集 |
| `src/main/resources/assets/takanarumod/blockstates/silver_blossom.json` | 新規 |
| `src/main/resources/assets/takanarumod/blockstates/potted_silver_blossom.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/block/silver_blossom.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/block/potted_silver_blossom.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_blossom.json` | 新規 |
| `src/main/resources/data/takanarumod/loot_tables/blocks/silver_blossom.json` | 新規 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（16x16ピクセルのPNG）:
- `src/main/resources/assets/takanarumod/textures/block/silver_blossom.png`（花のクロス型テクスチャ）
