# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 22: エンチャントを追加しよう

このステップでは、ツルハシ用のカスタムエンチャント「銀の手触り（Silver Touch）」を追加します。
銀鉱石を掘るとエンチャントレベルに応じて追加の銀の原石がドロップします（最大レベル3）。

### やること
- `SilverTouchEnchantment.java` を作成する（Enchantmentを拡張）
- `ModEnchantments.java` を作成してエンチャントを登録する
- `TakanaruMod.java` に登録を追加する
- `ModEvents.java` に `BlockEvent.BreakEvent` ハンドラを追加して追加ドロップを処理する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/enchantment/SilverTouchEnchantment.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/enchantment/ModEnchantments.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/event/ModEvents.java` | 編集 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
このステップでは新しいテクスチャは不要です。
