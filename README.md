# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 08: ツールを追加しよう

このステップでは、銀製のツール一式（剣・ツルハシ・斧・シャベル・クワ）を追加します。
性能は鉄とダイヤの間に設定しています。

### やること
- `ModToolTiers.java` を作成して銀のツールティアを定義する
- `ModTags.java` を作成してタグ参照用クラスを作る
- `ModItems.java` に5つのツールを登録する
- クリエイティブタブにツールを追加する
- 各ツールのアイテムモデルJSON・レシピ・翻訳を追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/item/ModToolTiers.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModTags.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModItems.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java` | 編集 |
| `src/main/resources/assets/takanarumod/models/item/silver_sword.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_pickaxe.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_axe.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_shovel.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_hoe.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_sword.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_pickaxe.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_axe.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_shovel.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_hoe.json` | 新規 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（16x16ピクセルのPNG）:
- `src/main/resources/assets/takanarumod/textures/item/silver_sword.png`
- `src/main/resources/assets/takanarumod/textures/item/silver_pickaxe.png`
- `src/main/resources/assets/takanarumod/textures/item/silver_axe.png`
- `src/main/resources/assets/takanarumod/textures/item/silver_shovel.png`
- `src/main/resources/assets/takanarumod/textures/item/silver_hoe.png`

テクスチャは [Piskel Kids](https://www.piskelapp.com/kids/) を使ってドット絵を描くのがおすすめです。
サイズは **16x16ピクセル** で作成し、PNG形式で保存してください。
