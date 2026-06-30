# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 14: ドアとトラップドアを追加しよう

このステップでは、開閉できるインタラクティブなブロック（銀のドア・銀のトラップドア）を追加します。
ドアは透明部分があるため、RenderTypeの設定（cutout）が必要です。

### やること
- `ModBlocks.java` に `DoorBlock`, `TrapDoorBlock` を登録する
- `TakanaruMod.java` のクライアント設定でRenderType.cutout()を設定する
- クリエイティブタブに追加する
- ブロックステート・ブロックモデル・アイテムモデルのJSONを追加する
- ルートテーブル・レシピ・翻訳・タグを追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/block/ModBlocks.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java` | 編集 |
| `src/main/resources/assets/takanarumod/blockstates/silver_door.json` | 新規 |
| `src/main/resources/assets/takanarumod/blockstates/silver_trapdoor.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/block/silver_door_*.json` (8ファイル) | 新規 |
| `src/main/resources/assets/takanarumod/models/block/silver_trapdoor_*.json` (3ファイル) | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_door.json` | 新規 |
| `src/main/resources/assets/takanarumod/models/item/silver_trapdoor.json` | 新規 |
| `src/main/resources/data/takanarumod/loot_tables/blocks/silver_door.json` | 新規 |
| `src/main/resources/data/takanarumod/loot_tables/blocks/silver_trapdoor.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_door.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_trapdoor.json` | 新規 |
| `src/main/resources/data/minecraft/tags/blocks/mineable/pickaxe.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（16x16ピクセルのPNG）:
- `src/main/resources/assets/takanarumod/textures/block/silver_door_top.png`（ドア上半分）
- `src/main/resources/assets/takanarumod/textures/block/silver_door_bottom.png`（ドア下半分）
- `src/main/resources/assets/takanarumod/textures/block/silver_trapdoor.png`（トラップドア）
- `src/main/resources/assets/takanarumod/textures/item/silver_door.png`（ドアのアイテムアイコン）

テクスチャは [Piskel Kids](https://www.piskelapp.com/kids/) を使ってドット絵を描くのがおすすめです。
サイズは **16x16ピクセル** で作成し、PNG形式で保存してください。
