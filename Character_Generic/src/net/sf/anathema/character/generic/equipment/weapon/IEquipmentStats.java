package net.sf.anathema.character.generic.equipment.weapon;

import net.sf.anathema.character.generic.util.IStats;
import net.sf.anathema.lib.util.IIdentificate;

public interface IEquipmentStats extends IStats, IIdentificate {
  boolean useAttunementModifiers();

  void setUseAttunementModifiers(boolean value);

  boolean representsItemForUseInCombat();
}