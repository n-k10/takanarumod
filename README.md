# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 18: 作物を追加しよう

このステップでは、植えて育てて収穫できる「銀のベリー」を追加します。
種を耕地に植えると、8段階で成長し、収穫時にベリーと種がドロップします。

### やること
- `SilverBerryCropBlock.java` を作成する（CropBlockを拡張）
- `ModBlocks.java` に作物ブロックを登録する（BlockItemなし）
- `ModItems.java` に銀のベリー（食べ物）と種（ItemNameBlockItem）を登録する
- クリエイティブタブに追加する
- blockstate（age 0-7）・各成長段階のモデル・アイテムモデル・ルートテーブル・翻訳を追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/block/SilverBerryCropBlock.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/block/ModBlocks.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModItems.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java` | 編集 |
| `src/main/resources/assets/takanarumod/blockstates/silver_berry_crop.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/block/silver_berry_crop_stage0〜7.json` (8ファイル) | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_berry.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_berry_seeds.json` | 新規 |
| `src/main/resources/data/takanarumod/loot_tables/blocks/silver_berry_crop.json` | 新規 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（16x16ピクセルのPNG）:

作物の成長段階（8枚）:
- `src/main/resources/assets/takanarumod/textures/block/silver_berry_crop_stage0.png` 〜 `stage7.png`

アイテムアイコン:
- `src/main/resources/assets/takanarumod/textures/item/silver_berry.png`
- `src/main/resources/assets/takanarumod/textures/item/silver_berry_seeds.png`

テクスチャは [Piskel Kids](https://www.piskelapp.com/kids/) を使ってドット絵を描くのがおすすめです。
サイズは **16x16ピクセル** で作成し、PNG形式で保存してください。
