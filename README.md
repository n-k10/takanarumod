# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 15: レッドストーンランプを作ろう

このステップでは、レッドストーン信号で点灯する「銀のランプ」を追加します。
カスタムブロッククラスを作成し、`BooleanProperty`（LIT）でオン/オフを管理します。

### やること
- `SilverLampBlock.java` を作成する（BooleanProperty LIT、neighborChanged でレッドストーン検知）
- `ModBlocks.java` に `SILVER_LAMP` を登録する（lightLevel でLIT状態に応じた光量を設定）
- クリエイティブタブに追加する
- ブロックステート（lit=true/false）・ブロックモデル・アイテムモデルのJSONを追加する
- ルートテーブル・レシピ・翻訳を追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/block/SilverLampBlock.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/block/ModBlocks.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java` | 編集 |
| `src/main/resources/assets/takanarumod/blockstates/silver_lamp.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/block/silver_lamp.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/block/silver_lamp_on.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_lamp.json` | 新規 |
| `src/main/resources/data/takanarumod/loot_tables/blocks/silver_lamp.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_lamp.json` | 新規 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（16x16ピクセルのPNG）:
- `src/main/resources/assets/takanarumod/textures/block/silver_lamp.png`（消灯時）
- `src/main/resources/assets/takanarumod/textures/block/silver_lamp_on.png`（点灯時）
