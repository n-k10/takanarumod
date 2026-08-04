# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 05: タグを設定しよう

このステップでは、ブロックにタグをつけて正しく動作するようにします。
タグを設定しないとツルハシで壊せなかったり、他のModとの連携ができません。

### やること
- 銀ブロック・銀鉱石を「ツルハシで採掘できる」タグに追加
- 銀鉱石を「鉄ツール以上が必要」タグに追加
- Forgeタグ（`ingots/silver`, `raw_materials/silver` など）を設定

### 追加するファイル
| ファイル | 種類 |
|---------|------|
| [`src/main/resources/data/minecraft/tags/blocks/mineable/pickaxe.json`](src/main/resources/data/minecraft/tags/blocks/mineable/pickaxe.json) | 新規 |
| [`src/main/resources/data/minecraft/tags/blocks/needs_iron_tool.json`](src/main/resources/data/minecraft/tags/blocks/needs_iron_tool.json) | 新規 |
| [`src/main/resources/data/forge/tags/items/ingots/silver.json`](src/main/resources/data/forge/tags/items/ingots/silver.json) | 新規 |
| [`src/main/resources/data/forge/tags/items/raw_materials/silver.json`](src/main/resources/data/forge/tags/items/raw_materials/silver.json) | 新規 |
| [`src/main/resources/data/forge/tags/blocks/ores/silver.json`](src/main/resources/data/forge/tags/blocks/ores/silver.json) | 新規 |
| [`src/main/resources/data/forge/tags/blocks/storage_blocks/silver.json`](src/main/resources/data/forge/tags/blocks/storage_blocks/silver.json) | 新規 |

### テクスチャ
このステップでは新しいテクスチャは不要です。
