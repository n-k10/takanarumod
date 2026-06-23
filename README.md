# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 03: レシピを追加しよう

このステップでは、クラフトレシピと精錬レシピを追加します。
JSONファイルだけで完結するので、Javaの変更はありません。

### やること
- 銀インゴット x9 → 銀ブロック（作業台でクラフト）
- 銀ブロック → 銀インゴット x9（作業台でクラフト）
- 銀鉱石 → 銀インゴット（かまどで精錬 / 溶鉱炉で粉砕）
- 銀の原石 → 銀インゴット（かまどで精錬 / 溶鉱炉で粉砕）

### 追加するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/resources/data/takanarumod/recipes/silver_block.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_from_silver_block.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_from_smelting_silver_ore.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_from_blasting_silver_ore.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_from_smelting_raw_silver.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_from_blasting_raw_silver.json` | 新規 |

### テクスチャ
このステップでは新しいテクスチャは不要です。
