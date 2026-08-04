# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 12: 燃料アイテムを追加しよう

このステップでは、かまどの燃料として使える「銀の石炭」を追加します。
石炭の2倍長く燃えます（3200tick = 160秒）。

### やること
- [`SilverCoalItem.java`](src/main/java/tech/takanaru/tutorialmod/item/SilverCoalItem.java) を作成して `getBurnTime()` をオーバーライドする
- [`ModItems.java`](src/main/java/tech/takanaru/tutorialmod/item/ModItems.java) に `SILVER_COAL` を登録する
- クリエイティブタブに追加する
- アイテムモデルJSON・レシピ・翻訳を追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| [`src/main/java/tech/takanaru/tutorialmod/item/SilverCoalItem.java`](src/main/java/tech/takanaru/tutorialmod/item/SilverCoalItem.java) | 新規 |
| [`src/main/java/tech/takanaru/tutorialmod/item/ModItems.java`](src/main/java/tech/takanaru/tutorialmod/item/ModItems.java) | 編集 |
| [`src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java`](src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java) | 編集 |
| [`src/main/resources/assets/takanarumod/models/item/silver_coal.json`](src/main/resources/assets/takanarumod/models/item/silver_coal.json) | 新規 |
| [`src/main/resources/data/takanarumod/recipes/silver_coal.json`](src/main/resources/data/takanarumod/recipes/silver_coal.json) | 新規 |
| [`src/main/resources/assets/takanarumod/lang/en_us.json`](src/main/resources/assets/takanarumod/lang/en_us.json) | 編集 |
| [`src/main/resources/assets/takanarumod/lang/ja_jp.json`](src/main/resources/assets/takanarumod/lang/ja_jp.json) | 編集 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（16x16ピクセルのPNG）:
- `src/main/resources/assets/takanarumod/textures/item/silver_coal.png`

テクスチャは [Piskel Kids](https://www.piskelapp.com/kids/) を使ってドット絵を描くのがおすすめです。
サイズは **16x16ピクセル** で作成し、PNG形式で保存してください。
