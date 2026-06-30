# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 09: 防具を追加しよう

このステップでは、銀製の防具一式（ヘルメット・チェストプレート・レギンス・ブーツ）を追加します。
装着するとプレイヤーの見た目が変わります。

### やること
- `ModArmorMaterials.java` を作成して銀の防具素材を定義する
- `ModItems.java` に4つの防具を登録する
- クリエイティブタブに防具を追加する
- 各防具のアイテムモデルJSON・レシピ・翻訳を追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/item/ModArmorMaterials.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModItems.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java` | 編集 |
| `src/main/resources/assets/takanarumod/models/item/silver_helmet.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_chestplate.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_leggings.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_boots.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_helmet.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_chestplate.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_leggings.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_boots.json` | 新規 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください:

アイテムアイコン用（16x16ピクセルのPNG）:
- `src/main/resources/assets/takanarumod/textures/item/silver_helmet.png`
- `src/main/resources/assets/takanarumod/textures/item/silver_chestplate.png`
- `src/main/resources/assets/takanarumod/textures/item/silver_leggings.png`
- `src/main/resources/assets/takanarumod/textures/item/silver_boots.png`

装着時の見た目用（バニラの鉄防具テクスチャを参考にしてください）:
- `src/main/resources/assets/takanarumod/textures/models/armor/silver_layer_1.png`（ヘルメット・チェスト・ブーツ用）
- `src/main/resources/assets/takanarumod/textures/models/armor/silver_layer_2.png`（レギンス用）

テクスチャは [Piskel Kids](https://www.piskelapp.com/kids/) を使ってドット絵を描くのがおすすめです。
アイテムアイコンは **16x16ピクセル** で作成し、PNG形式で保存してください。
