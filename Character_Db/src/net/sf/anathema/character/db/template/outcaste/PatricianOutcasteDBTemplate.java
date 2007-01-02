package net.sf.anathema.character.db.template.outcaste;

import net.sf.anathema.character.db.template.AbstractDbTemplate;
import net.sf.anathema.character.generic.additionalrules.IAdditionalRules;
import net.sf.anathema.character.generic.impl.magic.persistence.CharmCache;
import net.sf.anathema.character.generic.template.ITemplateType;
import net.sf.anathema.character.generic.template.TemplateType;
import net.sf.anathema.character.generic.template.creation.ICreationPoints;
import net.sf.anathema.character.generic.type.CharacterType;
import net.sf.anathema.lib.util.IIdentificate;
import net.sf.anathema.lib.util.Identificate;

public class PatricianOutcasteDBTemplate extends AbstractDbTemplate {
  public static final IIdentificate PATRICIAN_OUTCASTE_SUBTYPE = new Identificate("PatricianOutcasteSubtype"); //$NON-NLS-1$
  public static final ITemplateType TEMPLATE_TYPE = new TemplateType(CharacterType.DB, PATRICIAN_OUTCASTE_SUBTYPE);

  public ITemplateType getTemplateType() {
    return TEMPLATE_TYPE;
  }

  public PatricianOutcasteDBTemplate(CharmCache charmProvider, IAdditionalRules rules) {
    super(charmProvider, rules, new RealmOutcasteDbTraitTemplateFactory());
  }

  public ICreationPoints getCreationPoints() {
    return new PatricianOutcasteDbCreationPoints();
  }
}