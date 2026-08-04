# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 13: 装飾ブロックを追加しよう

このステップでは、銀ブロックのバリエーション（階段・ハーフブロック・感圧板）を追加します。
銀ブロックのテクスチャを使い回すので、新しいテクスチャは不要です。

### やること
- [`ModBlocks.java`](src/main/java/tech/takanaru/tutorialmod/block/ModBlocks.java) に `StairBlock`, `SlabBlock`, `PressurePlateBlock` を登録する
- クリエイティブタブに追加する
- ブロックステート・ブロックモデル・アイテムモデルのJSONを追加する
- ルートテーブル・レシピ・翻訳・タグを追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| [`src/main/java/tech/takanaru/tutorialmod/block/ModBlocks.java`](src/main/java/tech/takanaru/tutorialmod/block/ModBlocks.java) | 編集 |
| [`src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java`](src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java) | 編集 |
| [`src/main/resources/assets/takanarumod/blockstates/silver_stairs.json`](src/main/resources/assets/takanarumod/blockstates/silver_stairs.json) | 新規 |
| [`src/main/resources/assets/takanarumod/blockstates/silver_slab.json`](src/main/resources/assets/takanarumod/blockstates/silver_slab.json) | 新規 |
| [`src/main/resources/assets/takanarumod/blockstates/silver_pressure_plate.json`](src/main/resources/assets/takanarumod/blockstates/silver_pressure_plate.json) | 新規 |
| [`src/main/resources/assets/takanarumod/models/block/silver_stairs.json`](src/main/resources/assets/takanarumod/models/block/silver_stairs.json) | 新規 |
| [`src/main/resources/assets/takanarumod/models/block/silver_stairs_inner.json`](src/main/resources/assets/takanarumod/models/block/silver_stairs_inner.json) | 新規 |
| [`src/main/resources/assets/takanarumod/models/block/silver_stairs_outer.json`](src/main/resources/assets/takanarumod/models/block/silver_stairs_outer.json) | 新規 |
| [`src/main/resources/assets/takanarumod/models/block/silver_slab.json`](src/main/resources/assets/takanarumod/models/block/silver_slab.json) | 新規 |
| [`src/main/resources/assets/takanarumod/models/block/silver_slab_top.json`](src/main/resources/assets/takanarumod/models/block/silver_slab_top.json) | 新規 |
| [`src/main/resources/assets/takanarumod/models/block/silver_pressure_plate.json`](src/main/resources/assets/takanarumod/models/block/silver_pressure_plate.json) | 新規 |
| [`src/main/resources/assets/takanarumod/models/block/silver_pressure_plate_down.json`](src/main/resources/assets/takanarumod/models/block/silver_pressure_plate_down.json) | 新規 |
| [`src/main/resources/assets/takanarumod/models/item/silver_stairs.json`](src/main/resources/assets/takanarumod/models/item/silver_stairs.json) | 新規 |
| [`src/main/resources/assets/takanarumod/models/item/silver_slab.json`](src/main/resources/assets/takanarumod/models/item/silver_slab.json) | 新規 |
| [`src/main/resources/assets/takanarumod/models/item/silver_pressure_plate.json`](src/main/resources/assets/takanarumod/models/item/silver_pressure_plate.json) | 新規 |
| [`src/main/resources/data/takanarumod/loot_tables/blocks/silver_stairs.json`](src/main/resources/data/takanarumod/loot_tables/blocks/silver_stairs.json) | 新規 |
| [`src/main/resources/data/takanarumod/loot_tables/blocks/silver_slab.json`](src/main/resources/data/takanarumod/loot_tables/blocks/silver_slab.json) | 新規 |
| [`src/main/resources/data/takanarumod/loot_tables/blocks/silver_pressure_plate.json`](src/main/resources/data/takanarumod/loot_tables/blocks/silver_pressure_plate.json) | 新規 |
| [`src/main/resources/data/takanarumod/recipes/silver_stairs.json`](src/main/resources/data/takanarumod/recipes/silver_stairs.json) | 新規 |
| [`src/main/resources/data/takanarumod/recipes/silver_slab.json`](src/main/resources/data/takanarumod/recipes/silver_slab.json) | 新規 |
| [`src/main/resources/data/takanarumod/recipes/silver_pressure_plate.json`](src/main/resources/data/takanarumod/recipes/silver_pressure_plate.json) | 新規 |
| [`src/main/resources/data/minecraft/tags/blocks/mineable/pickaxe.json`](src/main/resources/data/minecraft/tags/blocks/mineable/pickaxe.json) | 編集 |
| [`src/main/resources/assets/takanarumod/lang/en_us.json`](src/main/resources/assets/takanarumod/lang/en_us.json) | 編集 |
| [`src/main/resources/assets/takanarumod/lang/ja_jp.json`](src/main/resources/assets/takanarumod/lang/ja_jp.json) | 編集 |

### テクスチャ
このステップでは新しいテクスチャは不要です（銀ブロックのテクスチャを使い回します）。
